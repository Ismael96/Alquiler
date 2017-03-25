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
public abstract class Bus extends VehiculoTransporte{
/**
 * Constructor
 */
    public Bus() {
        super();
    }
/**
 * Constructor n_plazas
 * @param n_plazas 
 */
 public Bus(int n_plazas) {
        super(n_plazas);
        this.getDuracion_dias_alquiler();
        this.getMatricula();
    }
  

   

   /**
    * 
    * @return Recibo
    */

    @Override
    public String recibo() {
        String recibo="---------------------"
                +"\t"+ "BUS"
                +"\t"+ "---------------------"
                +"\t"+(50+(1.5*super.getDuracion_dias_alquiler())+((1.5*super.getN_plazas())+(2*super.getN_plazas())));;
        return recibo;        
    
    }


    

    
  
   

    

       
    
    
}

