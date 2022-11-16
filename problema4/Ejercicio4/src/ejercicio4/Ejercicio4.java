/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int dias;
        double precioDia;
        double subTotal;
        double totalPagar = 0;
        double descuento = 0;

        System.out.println("Ingrese el número de días que desea hospedarse");
        dias = entrada.nextInt();

        System.out.println("Ingrese el costo de la habitación por día");
        precioDia = entrada.nextDouble();

        subTotal = dias * precioDia;

        if ((dias > 5) && (dias <= 10)) {
            descuento = (subTotal * 10) / 100;
            totalPagar = subTotal - descuento;
        } else if ((dias > 10) && (dias <= 15)) {
            descuento = (subTotal * 15) / 100;
            totalPagar = subTotal - descuento;
        } else if (dias > 15) {
            descuento = (subTotal * 20) / 100;
            totalPagar = subTotal - descuento;
        }else{
            totalPagar = subTotal;
        }
        System.out.println("-----------------------------");
        System.out.printf("El subtotal es: \n%.2f\nEl descuento es de:"
                + "\n%.2f\nEl total a cancelar es:\n%.2f\n",subTotal,
                descuento,totalPagar);
    }

}
