package Controlador;

public class Calculador {
// Defino variables a tomar

    private int A;
    private int B;
    private int mult;
    private int div;
    private int tabla;

    // Creo objeto vacio
    public Calculador() {
    }

// Creo objeto Calculador
    public Calculador(int A, int B, int mult, int div, int tabla, int calculos) {
        this.A = A;
        this.B = B;
        this.mult = mult;
        this.div = div;

    }
// Metodos GET/SET  numeros capturados por paquete vista

    public void establecerNumeros(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public int obtenerNumeroA(int A) {
        return A;
    }

    public int obtenerNumeroB(int B) {
        return B;
    }
// Calculos y tablas

    public int obtenerTotal(int A, int B) {
// Valido que el primer numero sea mayor que el segundo e inicio operaciones
        if (A > B) {
            System.out.println("El numero mayor es " + A);
            System.out.println("Se multiplica " + A + "*" + B);
            mult = A * B; 
            System.out.println(mult); // Multiplico e imprimo
            div = A / B;
            System.out.println("Se divide " + A + "/" + B);
            System.out.println(div); //Divido e imprimo
/* Inicio Ciclo for donde indico que iniciamos desde 1 hasta 10, 
emulando tablas de multiplicar e indico que variable "i "aumente de uno en uno*/
            System.out.println("El numero menor es: "+B);
            for (int i = 1; i < 11; i++) {
                tabla = B * i;
                System.out.println(B + "*" + i + "= " + tabla); // Se imprime tablas de multiplicar + variable "tabla" que almacena el dato operado

            }

        }
        // Valido que el segundo numero sea mayor que el primero e inicio operaciones
        if (B > A) {
            System.out.println("El numero mayor es " + B);
            mult = B * A; // Multiplico e imprimo
            System.out.println("Se multiplica " + A + "*" + B);
            System.out.println(mult);
            div = B / A;
            System.out.println("Se divide " + B + "/" + A); //Divido e imprimo
            System.out.println(div);
            /* Inicio Ciclo for donde indico que iniciamos desde 1 hasta 10, 
emulando tablas de multiplicar e indico que variable "i "aumente de uno en uno*/
            System.out.println("El numero menor es: "+A);
            for (int i = 0; i < 11; i++) {
                tabla = A * i;
                System.out.println(A + "*" + i + "= " + tabla); // Se imprime tablas de multiplicar + variable "tabla" que almacena el dato operado

            }
        }
        
        // Valido si los numeros son iguales e imprimo
        if (A == B) {
            System.out.println("Numeros iguales, sin operación pertinente");
        }

    }
}
