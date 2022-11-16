/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoKilovatio;
        double kilovatioNumero;
        double descuento = 10;
        int edad;
        double valorPlanilla;
        double totalPagar = 0;

        System.out.println("Ingrese el costo kilovatio/hora");
        costoKilovatio = entrada.nextDouble();

        System.out.println("Ingrese el número de kilovatios consumidos "
                + "en el mes");
        kilovatioNumero = entrada.nextDouble();

        System.out.println("Ingrese la edad del usuario");
        edad = entrada.nextInt();

        valorPlanilla = costoKilovatio * kilovatioNumero;

        if (edad > 65) {
            descuento = (valorPlanilla * descuento) / 100;
            totalPagar = valorPlanilla - descuento;

            System.out.println("-----------------------------");
            System.out.printf("El valor a cancelar es: \n%.2f\n",
                    totalPagar);
        } else {
            System.out.println("-----------------------------");
            System.out.printf("El valor a cancelar es: \n%.2f\n",
                    valorPlanilla);
        }

    }

}
