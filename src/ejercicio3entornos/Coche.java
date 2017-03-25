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
public abstract class Coche extends VehiculoTransporte{
    /**
     * Constructor
     */
      public Coche(){
       super();
    
   }
/**
 * 
 * @param n_plazas 
 */
    public Coche(int n_plazas) {
        super(n_plazas);
        this.getDuracion_dias_alquiler();
        this.getMatricula();
    }

   
      

   

  

    

    @Override
    public String recibo() {
        String recibo="---------------------"
                +"\t"+ "COCHE"
                +"\t"+ "---------------------"
                +"\t"+(50+(1.5*super.getDuracion_dias_alquiler())+(1.5*super.getN_plazas()));
        return recibo;        
    
    
}
}