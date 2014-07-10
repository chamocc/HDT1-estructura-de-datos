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
    /**
     * Pre:
     * Post:Devuelve una estacion favorita
     * @param boton
     * @return 
     */
    public double sacar(int boton);
    /**
     * Pre:
     * Post: Cambia la visibilidad de los botones
     */
    public void apagar();
    /**
     * Pre:
     * Post:Cambia de la visibilidad de los botones
     */
    public void encender();
    /**
     * Pre: 
     * Post: Guarda la estacion favorita
     * @param boton
     * @param estacion 
     */
    public void guardar(int boton, double estacion);
    /**
     * Pre:
     * Post:Devuelve una nueva estacion
     * @param frecuencia 
     */
    public void subirEstacion(boolean frecuencia);
    
    public void bajarEstacion(boolean frecuencia);
    public boolean getEncendido();
    public double getEstacionAM();
    public double getEstacionFM();
    public boolean getFrecuencia();
    
}
