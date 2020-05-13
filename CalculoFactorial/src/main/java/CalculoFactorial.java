/*
Desarrollar el programa del factorial de manera recursiva
 */

/**
 *
 * @author Nolvis Sanchez
 */
import java.util.Scanner; // Libreria

public class CalculoFactorial {

    public static void main(String[] args) {
        int acum = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 - 9");
        int num = entrada.nextInt();
        if (num < 10 && num > 0) {

            for (int i = num; i > 0; i--) {
                acum = acum * i;
                num--;
                System.out.println("acum =" + acum);
            }

        } else {
            System.out.println("Numero errado");
        }

        System.out.println("El factorial de numero ingresado " + num + "\nes : " + acum);

    }

}
