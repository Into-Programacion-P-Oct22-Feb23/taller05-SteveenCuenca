/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuestoPagar = 0;
        double precioVenta = 0;

        System.out.println("Ingrese la marca del vehiculo");
        marca = entrada.nextLine();

        System.out.println("Ingrese el país de origen");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del vehículo");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania")) {
            impuestoPagar = (costo * 20) / 100;
            precioVenta = costo + impuestoPagar;
        } else if (origen.equals("Japon")) {
            impuestoPagar = (costo * 30) / 100;
            precioVenta = costo + impuestoPagar;
        } else if (origen.equals("Italia")) {
            impuestoPagar = (costo * 15) / 100;
            precioVenta = costo + impuestoPagar;
        } else if (origen.equals("Usa")) {
            impuestoPagar = (costo * 8) / 100;
            precioVenta = costo + impuestoPagar;
        }
        System.out.println("-----------------------------");
        System.out.printf("La marca del vehículo es:\n%s\nEl país de "
                + "origen es:\n%s\nEl costo de impuesto por pagar es:\n%.2f\n"
                + "El precio de venta del vehiculo incluido el impuesto es:"
                + "\n%s\n", marca, origen, impuestoPagar,
                precioVenta);
    }
}    