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
public abstract class Camion extends VehiculoCarga{
    /**
     * Constructor
     */
     public Camion() {
        super();
    }
/**
 * 
 * @param carga_maxima
 * @param matricula
 * @param duracion_dias_alquiler 
 */
  public Camion(double carga_maxima, String matricula, int duracion_dias_alquiler) {
        super(carga_maxima, matricula, duracion_dias_alquiler);
    }
/**
 * 
 * @return Recibo
 */
 @Override
    public String recibo() {
        String recibo = "---------------------"
                + "\t" + "Camion"
                + "\t" + "---------------------"
                + "\t" +(50*super.getDuracion_dias_alquiler()+(20*super.getCarga_maxima())+40);
        return recibo;

    }
    
}
