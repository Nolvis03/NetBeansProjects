package CiclosEx;
import java.util.Scanner;

public class CicloWhile {
public static void main(String[] args) {
int numero=8;
    Scanner en = new Scanner(System.in);
    System.out.println("Ingrese un numero para empezar, se encuentra limitada del 1 al 10");
    int adivino = en.nextInt();
    
    
    while (adivino!=numero ){
        if (adivino <= numero){
            System.out.println("El numero ingresado es menor al que debes adivinar, sube un poco más");
        }
        else if(adivino >= numero){
            System.out.println("El numero ingresado es mayor al que debes adivinar, baja un poco más!!");
        }
       System.out.println("Ingrese su nuevo numero: ");
       adivino=en.nextInt();
   }
    System.out.println("Adivinaste buen trabajo!!");
}
    
}
