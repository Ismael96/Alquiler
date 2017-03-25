/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3entornos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICC-ICZ
 */
public final class Alquiler implements Datos {

    private ArrayList<Vehiculo> pedido;
/**
 * 
 * @param n_vehiculos 
 */
    public Alquiler(int n_vehiculos) {

        pedido = new ArrayList<>(n_vehiculos);

        for (int i = 0; i < pedido.size(); i++) {

            System.out.println("¿Qué vehículo deseas alquilar?(Indica:c(coche),b(bus),f(furgoneta),t(camion)");
            Scanner teclado = new Scanner(System.in);
            String letra = teclado.nextLine();
            char indicar = letra.charAt(0);
            if (indicar == 'c') {
                System.out.println("Indica el número de plazas:");
                Scanner teclado2 = new Scanner(System.in);
                int plazas = teclado2.nextInt();

                System.out.println("Duración del alquiler en días:");
                Scanner teclado3 = new Scanner(System.in);
                int días = teclado3.nextInt();

                System.out.println("Matricula del vehículo:");
                Scanner teclado4 = new Scanner(System.in);
                String matricula = teclado4.nextLine();
            }

            if (indicar == 'b') {
                System.out.println("Indica el número de plazas:");
                Scanner teclado2 = new Scanner(System.in);
                int plazas = teclado2.nextInt();

                System.out.println("Duración del alquiler en días:");
                Scanner teclado3 = new Scanner(System.in);
                int días = teclado3.nextInt();

                System.out.println("Matricula del vehículo:");
                Scanner teclado4 = new Scanner(System.in);
                String matricula = teclado4.nextLine();
            }
            if (indicar == 'f') {
                System.out.println("Indica la carga:");
                Scanner teclado2 = new Scanner(System.in);
                double carga = teclado2.nextDouble();

                System.out.println("Duración del alquiler en días:");
                Scanner teclado3 = new Scanner(System.in);
                int días = teclado3.nextInt();

                System.out.println("Matricula del vehículo:");
                Scanner teclado4 = new Scanner(System.in);
                String matricula = teclado4.nextLine();
            }
            if (indicar == 't') {
                System.out.println("Indica la carga:");
                Scanner teclado2 = new Scanner(System.in);
                double carga = teclado2.nextDouble();

                System.out.println("Duración del alquiler en días:");
                Scanner teclado3 = new Scanner(System.in);
                int días = teclado3.nextInt();

                System.out.println("Matricula del vehículo:");
                Scanner teclado4 = new Scanner(System.in);
                String matricula = teclado4.nextLine();
            }
        }
    }
/**
 * 
 * @return variable
 */
    public double importeTotal() {
        double variable = 0;
        for (int i = 0; i < pedido.size(); i++) {
            variable = variable + pedido.get(i).importeAlquiler();

        }
        return variable;
    }
/**
 * 
 * @param posicion
 * @return variable
 */
    public double importe(int posicion) {
        double variable = pedido.get(posicion).importeAlquiler();
        return variable;
    }
/**
 * Mostrar datos
 */
    
    @Override
    public void mostrarDatos() {
        System.out.println("Total alquiler: " + importeTotal() + "€" + "\n" + "--------------------------" + "\n" + "DETALLE" + "\n" + "-------------------------" + "\n");
        for (int i = 0; i < pedido.size(); i++) {
            System.out.println("Vehículo " + i + "\n" + "Información" + "\n" + pedido.get(i).recibo());

        }
    }

}
