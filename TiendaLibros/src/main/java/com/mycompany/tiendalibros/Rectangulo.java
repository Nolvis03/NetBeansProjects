
package com.mycompany.tiendalibros;
import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        int alto = scanner.nextInt();
        System.out.println("Proporciona el ancho:");
        int ancho = scanner.nextInt();
        int Área = alto*ancho;
        int Perimetro = (alto+ancho)*2;
        
        System.out.println("Area: " + Área);  
        
        System.out.println("Perimetro = "+ Perimetro);
               
    }
   
}
