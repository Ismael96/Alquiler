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
public abstract class Furgoneta extends VehiculoCarga {
/**
 * Constructor
 */
    public Furgoneta() {
        super();
    }
/**
 * 
 * @param carga_maxima
 * @param matricula
 * @param duracion_dias_alquiler 
 */
    public Furgoneta(double carga_maxima, String matricula, int duracion_dias_alquiler) {
        super(carga_maxima, matricula, duracion_dias_alquiler);
    }
/**
 * 
 * @return Recibo
 */
    @Override
    public String recibo() {
        String recibo = "---------------------"
                + "\t" + "FURGONETA"
                + "\t" + "---------------------"
                + "\t" +(50*super.getDuracion_dias_alquiler()+(20*super.getCarga_maxima()));
        return recibo;

    }

}
