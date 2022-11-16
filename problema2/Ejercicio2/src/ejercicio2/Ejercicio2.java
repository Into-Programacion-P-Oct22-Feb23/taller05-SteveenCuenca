/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String descripcion;
        int cantidad;
        double precioUnitario;
        double descuento = 10;
        double totalPagar;
        double valorTotal;
        
        System.out.println("Ingrese la descripción del articulo");
        descripcion = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad requerida");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario");
        precioUnitario = entrada.nextDouble();
        
        totalPagar = cantidad * precioUnitario;
        
        if(cantidad > 50){
            descuento = (totalPagar * descuento)/100;
            valorTotal = totalPagar - descuento;
            
            System.out.println("-----------------------------");
            System.out.printf("Artículo: \n%s\nCosto del pedido:\n%.2f\n"
                    , descripcion, valorTotal);
        }else{
            System.out.println("-----------------------------");
            System.out.printf("Articulo: \n%s\nCosto del pedido:\n%.2f\n"
                    , descripcion, totalPagar);
        }
    }
    
}
