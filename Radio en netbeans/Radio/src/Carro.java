/**
 * Esta clase es el driver que llama al GUI y corre el programa
 * 
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @author Alejandro Diaz 13082
 * 
 * @since 5/07/2014
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
