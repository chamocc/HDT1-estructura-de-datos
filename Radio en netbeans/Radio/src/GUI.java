/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Daniel
 * @author Edgar Chamo
 * @author Alejandro Diaz
 */
public class GUI extends JPanel{
    
    private JButton bajarEstacion, subirEstacion, power, frecuencia, guardarLeer;
    private JButton[] favoritos;
    private JLabel estacion;
    private Radio miRadio;
    private boolean guardar;
    
    public GUI(){
        miRadio=new Radio();
        guardar=false;
        bajarEstacion=new JButton("-");
        bajarEstacion=new JButton("+");
        power=new JButton("OFF");
        frecuencia=new JButton("FM");
        guardarLeer=new JButton("Guardar");
        estacion=new JLabel ("87.9");
        
        favoritos=new JButton[12];
        for(int i=0; i<12; i++){
            favoritos[i]=new JButton("Fav #"+(i+1));
        }
        ListenerBoton listener1= new ListenerBoton();
	bajarEstacion.addActionListener(listener1);
        subirEstacion.addActionListener(listener1);
        power.addActionListener(listener1);
        frecuencia.addActionListener(listener1);
        guardarLeer.addActionListener(listener1);
    }
    
    private class ListenerBoton implements ActionListener
	{
            public void actionPerformed(ActionEvent event)
            {
                  if(event.getSource()==bajarEstacion)
			{
                            miRadio.bajarEstacion(miRadio.getFrecuencia());
                            estacion.setText(miRadio.getEstacion());
                        }
                  if(event.getSource()==subirEstacion)
			{
                            miRadio.subirEstacion(miRadio.getFrecuencia());
                            estacion.setText(miRadio.getEstacion());
                        }
                  if(event.getSource()==power)
			{
                            if(miRadio.getEncendido()){
                                miRadio.apagar();
                                power.setText("OFF");
                            }else{
                                miRadio.encender();
                                power.setText("ON");
                            }
                        }
                  
                 if(event.getSource()==frecuencia)
			{
                            if(miRadio.getFrecuencia()){
                                miRadio.cambiarFrecuencia(false);
                            }else{
                                miRadio.cambiarFrecuencia(true);
                            }
                        } 
            }
    }
}
