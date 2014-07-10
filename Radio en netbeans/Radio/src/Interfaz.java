/*
 * Esta clase es la Interfaz que permite implementar 
 * los metodos para el funcionamiento de la radio.
 */

/**
 * @author Daniel Gerendas 13158
 * @author Edgar Chamo 13083
 * @author Alejandro Diaz 13082
 * @since 05/07/2014
 */
public interface Interfaz {
    /**
     * Pre: 
     * Post: la variable frecuencia se vuelve verdadero o falso
     * @param frecuencia 
     */
    public void cambiarFrecuencia(boolean frecuencia);
    public double sacar(int boton);
    public void apagar();
    public void encender();
    public void guardar(int boton, double estacion);
    public void subirEstacion(boolean frecuencia);
    public void bajarEstacion(boolean frecuencia);
    public boolean getEncendido();
    public double getEstacionAM();
    public double getEstacionFM();
    public boolean getFrecuencia();
    
}
