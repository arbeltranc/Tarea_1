/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicación;

/**
 *
 * @author Alex
 */
import java.lang.*;
import java.io.*;
import java.util.*;
public class Multiplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,resultado = 0;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el primer digito:");
        n1=Teclado.nextInt();
        System.out.println("Ingrese el segundo digito:");
        n2=Teclado.nextInt();
        resultado=n1*n2;
        System.out.println("El resultado es "+resultado);
    }
    
}
