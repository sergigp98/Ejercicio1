/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Usuario DAM 1
 */

import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        double primeranota;
        double segundanota;
        double mediadeseada;
        
        System.out.println("Introduce la nota del primer examen: ");
        primeranota = sc.nextDouble();        
        primeranota = primeranota *0.4;
        
        System.out.println("¿Qué nota quieres sacar en el trimestre: ");
        mediadeseada= sc.nextDouble();
        
        segundanota = (mediadeseada-primeranota)/0.6;
        
        System.out.println("Para tener un "+mediadeseada+" en el trimestre necesitas sacar un "+segundanota+" en el segundo examen");
        
        
        
        
    }
    
}
