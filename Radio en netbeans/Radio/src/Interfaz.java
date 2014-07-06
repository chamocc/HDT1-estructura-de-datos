/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public interface Interfaz {
    
    public void cambiarFrecuencia(boolean frecuencia);
    public double sacar(int boton);
    public void apagar();
    public void encender();
    public void guardar(int boton, double estacion);
    public void suberEstacion(boolean frecuencia);
    public void bajarEstacion(boolean frecuencia);
    
}
