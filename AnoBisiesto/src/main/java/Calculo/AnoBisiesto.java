package Calculo;
import java.util.Scanner;


public class AnoBisiesto {
public static void main (String [] Args){
Scanner in = new Scanner(System.in);
System.out.println("Ingrese el año a calcular: ");
int val = in.nextInt();
if(val %4==0 && val%100!=0 || val%400==0) {
        System.out.println("Año biciesto");
}
else {
            System.out.println("Año no biciesto");
} 
}}

