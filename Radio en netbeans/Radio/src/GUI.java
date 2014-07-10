/*
 *Esta clase es la parte grafica del programa
 *la cual le permite al usuario interactuar con los botones
 *simulando una radio de la vida real. 
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @author Alejandro Diaz 13082
 * 
 * @since 5/07/2014
 */
public class GUI extends JPanel{
    
    private JButton bajarEstacion, subirEstacion, power, frecuencia, guardarLeer;
    private JButton[] favoritos;
    private JLabel estacion;
    private Interfaz miRadio;
    private boolean guardar;
    private Color c1;
   
    //metodos
    //constructor: se encarga de inicializar las varibles que se utilizaran en esta clase, asi como de las caracteristicas del panel
    public GUI(){

        
        
        c1= new Color(224,20,15);
        setBackground(c1);

        setLayout(null);

        miRadio=new Radio();
        guardar=true;
        bajarEstacion=new JButton("-");
        bajarEstacion.setBounds(10, 140, 50, 50);
        bajarEstacion.setBackground(Color.ORANGE);
        
        subirEstacion=new JButton("+");
        subirEstacion.setBounds(10, 80, 50,50 );
        subirEstacion.setBackground(Color.ORANGE);
        
        power=new JButton("ON");
        power.setBounds(10, 10, 60,60 );
        power.setBackground(Color.ORANGE);
        
        frecuencia=new JButton("AM");
        frecuencia.setBounds(80, 10, 80, 50);
        frecuencia.setBackground(Color.ORANGE);
        
        guardarLeer=new JButton("Guardar");
        guardarLeer.setBounds(170, 10, 80,50 );
        guardarLeer.setBackground(Color.ORANGE);
                
        estacion=new JLabel ("530");
        estacion.setBounds(80, 70, 50,50 );
        estacion.setBackground(Color.ORANGE);
        
        favoritos=new JButton[12];
        for(int i=0; i<12; i++){
            favoritos[i]=new JButton("Fav #"+(i+1));
            favoritos[i].setBounds(10+(i*90),250,90,50);
            favoritos[i].setBackground(Color.ORANGE);
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
        setPreferredSize(new Dimension(1200,300));
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
    
    /** 
     * Encendido: este metodo se encarga de habilitar los botones dentro del panel
     */
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
     
     /**
      * Apagado este metodo se encarga de deshabilitar los botnes dentro del panl
      */
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
