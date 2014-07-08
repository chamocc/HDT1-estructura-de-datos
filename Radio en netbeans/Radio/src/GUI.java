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
    
    //metodos
    //constructor
    public GUI(){
        miRadio=new Radio();
        guardar=false;
        bajarEstacion=new JButton("-");
        bajarEstacion=new JButton("+");
        power=new JButton("OFF");
        frecuencia=new JButton("FM");
        guardarLeer=new JButton("Guardar");
        
        favoritos=new JButton[12];
        for(int i=0; i<12; i++){
            favoritos[i]=new JButton("Fav #"+(i+1));
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
