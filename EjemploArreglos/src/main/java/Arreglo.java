
import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de datos a ingresar: ");
        int dato = entrada.nextLine();
        entrada.nextLine();
        Auto Autos[] = new Auto[dato];

        for (int i = 0; i < Autos.length; i++) {
            System.out.println("Ingrese el valor para la posición " + i + ": ");
            Autos[i] = new Auto(entrada.nextLine());
           

        }

        for (int j = 0; j < Autos.length; j++) {
            System.out.println("El valor ingresado en la posición " + j + Autos[j]);
        }

    }

}
