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
public abstract class VehiculoTransporte extends Vehiculo {
 
    private int n_plazas;
/**
 * Constructor por defecto
 */
    public VehiculoTransporte() {
        super();
        n_plazas=0;
        
    }
/**
 * 
 * @param n_plazas 
 */
    public VehiculoTransporte(int n_plazas) {
        this.n_plazas = n_plazas;
    }
/**
 * 
 * @return numero de plazas
 */
    public int getN_plazas() {
        return n_plazas;
    }
/**
 * 
 * @param n_plazas 
 */
    public void setN_plazas(int n_plazas) {
        this.n_plazas = n_plazas;
    }

  
/**
 * 
 * @return Recibo
 */
    

    @Override
    public String recibo() {
        
        String recibo="Matricula:"+super.getMatricula()+"\n"+"Duración:"+super.getDuracion_dias_alquiler()+"\n"+"Plazas:"+this.getN_plazas()+"Importe:"+this.importeAlquiler();
        
        return recibo;
    }

   
    
    
}
