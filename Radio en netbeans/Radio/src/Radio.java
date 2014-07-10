/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Daniel 13158
 * @author Edgar Chamo 13083
 * @author Alejandro Diaz 13082
 * 
 * @since 5/7/2014
 */
public class Radio implements Interfaz{

    private double frecuenciaAM, frecuenciaFM;
    private boolean power, frecuencia;
    private double[] favoritosAM, favoritosFM;
    
    /**
     * Este metodo es el constructro de la clase
     * No recibe nada y no devuelve nada
     */
    
    public Radio(){
        power=true;
        frecuencia=false;
        favoritosAM=new double[]{530,530,530,530,530,530,530,530,530,530,530,530};
        favoritosFM=new double[]{87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9, 87.9};
        frecuenciaAM=530;
        frecuenciaFM=87.9;
    
    }
    /**
     * Este metodo cambia la frecuencia del radio segun lo que se mande
     * No devuelve nada
     * @param _frecuencia es true para FM y false para AM
     */
    
    @Override
    public void cambiarFrecuencia(boolean _frecuencia) {
       frecuencia=_frecuencia;
    }

    
    /**
     * Este metodo obtiene el valor guardado en un espacio de la lista de favoritos
     * @param boton es el boton donde esta guardado el valor
     * @return devuelve la frecuencia tipo double
     */
    @Override
    public double sacar(int boton) {
        double val;
        if(frecuencia){
            val=favoritosFM[boton];
            frecuenciaFM=val;
        }else{
            val=favoritosAM[boton];
            frecuenciaAM=val;
        }
        return val;
    }

    /**
     * Este metodo pone en false el atributo power de la clase
     * No devuelve nada
     */
    @Override
    public void apagar() {
        power=false;
    }

    /**
     * Este metodo pone en true el atributo power de la clase
     * No devuelve nada
     */
    @Override
    public void encender() {
        power=true;
    }

    /**
     * Este metodo guarda el valor actual de la estacion en alguno de los botones
     * @param boton indica en que botón se guarda
     * @param estacion indica que estación se debe guardar
     */
    @Override
    public void guardar(int boton, double estacion) {
         if(frecuencia){
            favoritosFM[boton]=estacion;
        }else{
            favoritosAM[boton]=estacion;
        }
    }

    /**
     * Aumenta el valor de la estación. 
     * @param frecuencia Si la frecuencia es true lo hace para FM y si es false lo hace para AM
     */
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
     /**
     * Disminuye el valor de la estación. 
     * @param frecuencia Si la frecuencia es true lo hace para FM y si es false lo hace para AM
     */
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
    /**
     * Devuelve true si power es true y false si power es false
     * @return devuelve boolean
     */
    @Override
    public boolean getEncendido() {
        return power;
    }
    
    /**
     * Obtiene la frecuencia AM
     * @return devuelve double
     */
    @Override
    public double getEstacionAM(){
        return frecuenciaAM;
    }
    /**
     * Obtiene la frecuencia FM
     * @return devuelve double
     */
    public double getEstacionFM(){
        return frecuenciaFM;
    }
    
    /**
     * Devuelve true si frecuencia es true y false si power es false
     * @return devuelve boolean
     */
    @Override
    public boolean getFrecuencia(){
        return frecuencia;
    }
    
    
}
