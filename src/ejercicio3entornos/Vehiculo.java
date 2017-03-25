/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3entornos;

/**
 *
 * @author user
 */
public abstract class Vehiculo {

    private String matricula;
    private int duracion_dias_alquiler;
/**
 * Constructor por defecto
 */
    public Vehiculo() {
        matricula = "";
        duracion_dias_alquiler = 0;
    }

    /**
     * Constructor
     *
     * @param matricula
     * @param duracion_dias_alquiler
     */
    public Vehiculo(String matricula, int duracion_dias_alquiler) {
        this.matricula = matricula;
        this.duracion_dias_alquiler = duracion_dias_alquiler;
    }
/**
 *  
 * @return de la matricula
 */
    public String getMatricula() {
        return matricula;
    }
/**
 * 
 * @param matricula 
 */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
/**
 * 
 * @return duracion del alquiler en dia
 */
    public int getDuracion_dias_alquiler() {
        return duracion_dias_alquiler;
    }
/**
 * 
 * @param duracion_dias_alquiler 
 */
    public void setDuracion_dias_alquiler(int duracion_dias_alquiler) {
        this.duracion_dias_alquiler = duracion_dias_alquiler;
    }
/**
 * 
 * @return Metodo Importe Alquiler
 */
    public abstract double importeAlquiler();
/**
 * 
 * @return Metodo Recibo
 */
    public abstract String recibo();

}
