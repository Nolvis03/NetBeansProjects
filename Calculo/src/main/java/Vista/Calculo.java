/*Creador: Nolvis Sanchez V
Diseño de Algoritmos**/
package Vista;

import Controlador.Calculador; // importo clase donde se almacenan las operaciones
import java.util.Scanner; // Importo Libreria que toma los datos del usuario

public class Calculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// Defino variable entrada como datos a ingresar al sistema
        Calculador inicio = new Calculador();
        
        System.out.println("Capture dos numeros por pantalla\n" +
"Los compare\n" +
"Al mayor, multiplicarlo por el menor y dividirlo sobre el menor\n" +
"Mostrar los resultados\n" +
"Al número menor generarle la tabla de multipicar del 1 al 10\n" +
"Si los dos númros son iguales, mensaje que indique que los números son iguales\n" +
"iguales");
        {
            System.out.println("Ingrese numero 1 de tipo entero");
            //Capturo datos para mi variable A
            int A = entrada.nextInt();
            inicio.establecerNumeros(A, A);
            System.out.println("Ingrese numero 2 de tipo entero");
            //Capturo datos para mi variable A
            int B = entrada.nextInt();
            inicio.establecerNumeros(B, B);

            // Imprimo resultado de la validación y operaciones captadas
            System.out.println("");
            System.out.println(inicio.obtenerTotal(A, B));

        }
    }

}
