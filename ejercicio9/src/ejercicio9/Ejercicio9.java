/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author emil
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realiza una aplicación que nos pida un número de ventas a introducir,
después nos pedirá tantas ventas por teclado como número de ventas
se hayan indicado. Al final mostrara la suma de todas las ventas*/
       
        Scanner scan = new Scanner(System.in);
      int variable = 1; 
      System.out.print("ingrese la cantidad de ventas ");
        int ventasTotales = scan.nextInt();        
       int total = 0 ;     
       while(variable <= ventasTotales){
        int ventasD = scan.nextInt();
        variable++;
        total= ventasD + total;
        }
       System.out.println("su total de ventas es " +total);
    }
    
}
