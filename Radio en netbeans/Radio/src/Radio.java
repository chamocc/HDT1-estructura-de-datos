/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Daniel
 * @author Ed. Chamo
 */
public class Radio implements Interfaz{

    private double frecuenciaAM, frecuenciaFM;
    private boolean power, frecuencia;
    private double[] favoritosAM, favoritosFM;
    
    public Radio(){
        power=false;
        frecuencia=false;
        favoritosAM=new double[12];
        favoritosFM=new double[12];
        frecuenciaAM=530;
        frecuenciaFM=87.9;
    
    }
    
    @Override
    public void cambiarFrecuencia(boolean frecuencia) {
       frecuencia=true;
    }

    @Override
    public double sacar(int boton) {
        //todavía falta programarlo
        return 9;
    }

    @Override
    public void apagar() {
    }

    @Override
    public void encender() {
    }

    @Override
    public void guardar(int boton, double estacion) {
    }

    @Override
    public void subirEstacion(boolean frecuencia) {
    }

    @Override
    public void bajarEstacion(boolean frecuencia) {
    }
    
}
