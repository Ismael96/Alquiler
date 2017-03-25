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
public abstract class VehiculoCarga extends Vehiculo {

    private double carga_maxima;
/**
 * Constructor por defecto
 */
    public VehiculoCarga() {
        super();
        carga_maxima = 0;
    }
/**
 * Constructor
 * @param carga_maxima 
 */
   
/**
 * Constructor
 * @param carga_maxima
 * @param matricula
 * @param duracion_dias_alquiler 
 */
    public VehiculoCarga(double carga_maxima, String matricula, int duracion_dias_alquiler) {
        super(matricula, duracion_dias_alquiler);
        this.carga_maxima = carga_maxima;
    }
/**
 * 
 * @return de la carga maxima
 */
    public double getCarga_maxima() {
        return carga_maxima;
    }
/**
 * 
 * @param carga_maxima 
 */
    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
/**
 * 
 * @return Recibo
 */
    public abstract double alquiler();

    @Override
    public String recibo() {
        String recibo = "Matricula:"+super.getMatricula() + "\n" + "Duración:" + super.getDuracion_dias_alquiler()+"\t"+"Importe:";
        return recibo;
    }
}
