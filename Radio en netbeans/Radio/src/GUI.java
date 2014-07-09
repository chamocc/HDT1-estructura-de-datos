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
 * @author Daniel 13158
 * @author Edgar Chamo 13083
 * @author Alejandro Diaz 13082
 */
public class GUI extends JPanel{
    
    private JButton bajarEstacion, subirEstacion, power, frecuencia, guardarLeer;
    private JButton[] favoritos;
    private JLabel estacion;
    private Radio miRadio;
    private boolean guardar;
    
    //metodos
    //constructor
    public GUI(){
        miRadio=new Radio();
        guardar=true;
        bajarEstacion=new JButton("-");
        subirEstacion=new JButton("+");
        power=new JButton("OFF");
        frecuencia=new JButton("AM");
        guardarLeer=new JButton("Guardar");
        estacion=new JLabel ("530");
        
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
        
        for(int i=0; i<12; i++){
            favoritos[i].addActionListener(listener1);
        }
        
        add(bajarEstacion);
        add(subirEstacion);
        add(estacion);
        add(power);
        add(frecuencia);
        add(guardarLeer);
        for(int i=0; i<12; i++){
            add(favoritos[i]);
        }
        setPreferredSize(new Dimension(600,300));
    }
    
    private class ListenerBoton implements ActionListener
	{
            public void actionPerformed(ActionEvent event)
            {
                  if(event.getSource()==bajarEstacion)
			{
                            boolean val=miRadio.getFrecuencia();
                            miRadio.bajarEstacion(val);
                            if(miRadio.getFrecuencia()){
                                estacion.setText(miRadio.getEstacionFM()+"");
                            }else{
                                estacion.setText(miRadio.getEstacionAM()+"");
                            }
                            
                        }
                  if(event.getSource()==subirEstacion)
			{
                            boolean val=miRadio.getFrecuencia();
                            miRadio.subirEstacion(val);
                           if(miRadio.getFrecuencia()){
                                estacion.setText(miRadio.getEstacionFM()+"");
                            }else{
                                estacion.setText(miRadio.getEstacionAM()+"");
                            }
                        }
                  if(event.getSource()==power)
			{
                            if(miRadio.getEncendido()){
                                miRadio.apagar();
                                power.setText("OFF");
                                apagado();
                            }else{
                                miRadio.encender();
                                power.setText("ON");
                                encendido();
                            }
                        }
                  
                 if(event.getSource()==frecuencia)
			{
                            if(miRadio.getFrecuencia()){
                                miRadio.cambiarFrecuencia(false);
                                frecuencia.setText("AM");
                            }else{
                                miRadio.cambiarFrecuencia(true);
                                frecuencia.setText("FM");
                            }
                        }
                 
                  if(event.getSource()==guardarLeer)
			{
                            if(guardar){
                                guardar=false;
                                guardarLeer.setText("Leer");
                            }else{
                                guardar=true;
                                guardarLeer.setText("Guardar");
                            }
                        }
                  
                 for(int i=0; i<12; i++){
                     if(event.getSource()==favoritos[i]){
                         if(guardar){
                             double val=0;
                             if(miRadio.getFrecuencia()){
                               val=miRadio.getEstacionFM();
                            }else{
                               val=miRadio.getEstacionAM();
                            }
                             miRadio.guardar(i, val);
                         }else{
                             estacion.setText(miRadio.sacar(i)+"");
                         }
                     } 
                 }
            }

    }
    
    /** encendido: este metodo se encarga de habilitar los botones dentro del panel */
     public void encendido()
     {
        bajarEstacion.setEnabled(true);
        subirEstacion.setEnabled(true);
        frecuencia.setEnabled(true);
        guardarLeer.setEnabled(true);
        for (int i =0;i<12;i++ )
        {
            favoritos[i].setEnabled(true);
        }
     }
     
     /** apagado: este metodo se encarga de desahabilitar los botones dentro del panel */
     public void apagado()
     {
        bajarEstacion.setEnabled(false);
        subirEstacion.setEnabled(false);
        frecuencia.setEnabled(false);
        guardarLeer.setEnabled(false);
        for (int i =0;i<12;i++ )
        {
            favoritos[i].setEnabled(false);
        }
     }
    
    
    
}
