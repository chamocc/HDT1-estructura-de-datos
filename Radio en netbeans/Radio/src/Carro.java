/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Daniel
 * @author Ed. Chamo
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Carro {

        public static void main(String[] args) {
                        
                    //se crea un objeto frame
                    JFrame frame = new JFrame ("Pioneer");
                    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
                    frame.getContentPane().add(new GUI());

                    frame.pack();
                    frame.setVisible(true);
                }
		
}
