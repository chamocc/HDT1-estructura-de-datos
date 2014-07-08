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
    public void cambiarFrecuencia(boolean _frecuencia) {
       frecuencia=_frecuencia;
    }

    @Override
    public double sacar(int boton) {
        double val;
        if(frecuencia){
            val=favoritosFM[boton];
        }else{
            val=favoritosAM[boton];
        }
        return val;
    }

    @Override
    public void apagar() {
        power=false;
    }

    @Override
    public void encender() {
        power=true;
    }

    @Override
    public void guardar(int boton, double estacion) {
         if(frecuencia){
            favoritosFM[boton]=estacion;
        }else{
            favoritosAM[boton]=estacion;
        }
    }

    @Override
    public void subirEstacion(boolean frecuencia) {
         if(frecuencia){
            frecuenciaFM+=0.2;
            if(frecuenciaFM>107.9){
                frecuenciaFM=87.9;
            }
        }else{
            frecuenciaAM+=10;
            if(frecuenciaAM>1610){
                frecuenciaAM=530;
            }
        }
    }

    @Override
    public void bajarEstacion(boolean frecuencia) {
        if(frecuencia){
            frecuenciaFM-=0.2;
            if(frecuenciaFM<87.9){
                frecuenciaFM=107.9;
            }
        }else{
            frecuenciaAM-=10;
            if(frecuenciaAM<530){
                frecuenciaAM=1610;
            }
        }
    }
    
    @Override
    public boolean getEncendido() {
        return power;
    }
    
    
}
