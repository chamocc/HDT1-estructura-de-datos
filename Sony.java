

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.io.*; 
import java.util.*; 
import javax.swing.event.*;


public class Sony extends JPanel {
	//Atributos
	private JButton btONOFF, btSeleccion, btNext, btPrev, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12;
	private JLabel lbEstadoONOFF, lbBanda;
	private JPanel p;
		
	public Sony(){
		//Nuevo panel
		p = new JPanel();
		
		//Botones
		btONOFF = new JButton("ON/OFF");
		btSeleccion = new JButton("Banda");
		btNext = new JButton("Next");
		btPrev = new JButton("Previous");
		bt1 = new JButton(" 1 ");
		bt2 = new JButton(" 2 ");
		bt3 = new JButton(" 3 ");
		bt4 = new JButton(" 4 ");
		bt5 = new JButton(" 5 ");
		bt6 = new JButton(" 6 ");
		bt7 = new JButton(" 7 ");
		bt8 = new JButton(" 8 ");
		bt9 = new JButton(" 9 ");
		bt10 = new JButton(" 10 ");
		bt11 = new JButton(" 11 ");
		bt12 = new JButton(" 12 ");
		
		//Labels
		lbEstadoONOFF = new JLabel("On/Off");
		lbBanda = new JLabel("AM/FM");
		
		
		add(lbEstadoONOFF);
		add(btONOFF);
		
		add(lbBanda);
		add(btSeleccion);
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
		add(bt7);
		add(bt8);
		add(bt9);
		add(bt10);
		add(bt11);
		add(bt12);
		
		add(btNext);
		add(btPrev);
		
	}
	
	
	
}