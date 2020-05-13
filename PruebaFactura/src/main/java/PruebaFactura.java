/*Estudiantes, se debe realizar un código en un lenguaje de POO en el que se genera una factura, 
que incluya varios artículos, con diferentes precios, que calcule el IVA, 
el valor a pagar antes de IVA y el valor total con IVA incluido. El programa debe, 
en lo posible permitir agregar artículos a la factura antes de generarla. Los precios, 
referencias y modelos pueden ser ingresados previamente, sin embargo, 
la adición de artículos sí debe ser hecha por el usuario a través del programa. 
Pueden utilizar la estructura cíclica que mejor se les acomode en su diseño.

@Author Nolvis Sanchez V - 265059 - Diseño Algoritmos
 */

import java.util.Scanner; // importo libreria para obtener datos por teclado

public class PruebaFactura { // Clase principal PruebaFactura Heredando variable de 

    public static void main(String[] args) {
        int opcion; // Variable para inicializar estado para ciclo do while, consultar si desea comprar articulos

        // Creación de objetos heredados de Clase Articulos, argumentos tres pre-definidos:
        Articulos a1 = new Articulos(0001, "Televisor", 780365);
        Articulos a2 = new Articulos(0002, "Lavadora", 1080365);
        Articulos a3 = new Articulos(0003, "Licuadora", 60565);
        Articulos a4 = new Articulos(0004, "Nevera", 670365);
        Articulos a5 = new Articulos(0005, "Estufa", 320365);
        //Creación de Objetos herados de Clase Factura sin argumentos
        Factura f1 = new Factura();
        Scanner entrada = new Scanner(System.in); // Construtor capturar datos con libreria Scanner 
        System.out.println("Ingrese su nombre y apellido");
        String nombre = entrada.nextLine();
        f1.setNombreUsuario(nombre);// Almaceno variable nombre en metodo creado en Clase factura
        //inicio ciclo do while 
        do {
            System.out.println("¿Desea comprar articulos? \n Ingrese 1 para comprar articulos \n ingrese 0 para culminar compra:  ");
            opcion = entrada.nextInt();
            if (opcion == 1) { // Evalua respuesta ingresada e inicia impresión de productos
                System.out.println("Ingrese el ID del articulo a comprar :\n");
                System.out.println("ID\tNombre Articulo\tPrecio");
                System.out.println(a1.getIdArticulo() + "\t" + a1.getNombreArt() + "\t" + "\t" + a1.getPrecioArt());
                System.out.println(a2.getIdArticulo() + "\t" + a2.getNombreArt() + "\t" + "\t" + a2.getPrecioArt());
                System.out.println(a3.getIdArticulo() + "\t" + a3.getNombreArt() + "\t" + "\t" + a3.getPrecioArt());
                System.out.println(a4.getIdArticulo() + "\t" + a4.getNombreArt() + "\t" + "\t" + "\t" + a4.getPrecioArt());
                System.out.println(a5.getIdArticulo() + "\t" + a5.getNombreArt() + "\t" + "\t" + "\t" + a5.getPrecioArt());
                int valor = entrada.nextInt();// -se almacena variable ingresada por teclado y se asigna a nueva variable para inicializar Switch
                switch (valor) { // Se evalua los posibles casos a ingresar por teclado, para que asigne un valor al objeto factura e imprima lo que se compró
                    case 1:
                        System.out.println("Producto " + a1.getNombreArt() + " Comprado");
                        f1.setvSinIva(a1.precioArt);
                        break;
                    case 2:
                        System.out.println("Producto " + a2.getNombreArt() + " Comprado");
                        f1.setvSinIva(a2.precioArt);
                        break;
                    case 3:
                        System.out.println("Producto " + a3.getNombreArt() + " Comprado");
                        f1.setvSinIva(a3.precioArt);
                        break;
                    case 4:
                        System.out.println("Producto " + a4.getNombreArt() + " Comprado");
                        f1.setvSinIva(a4.precioArt);
                        ;
                        break;
                    case 5:
                        System.out.println("Producto " + a5.getNombreArt() + " Comprado");
                        f1.setvSinIva(a5.precioArt);
                        break;
                    default:
                        System.out.println("Numero de producto errado");
                }
            } else if (opcion == 0) // Se evalua si ingresa 0 para que corte el codigo  salte a la siguiente linea
            {
                break;
            } else { // Se evalua si ingresa un valor diferente para que corte el programa y salte a la siguiente linea
                System.out.println("Numero errado, fin del programa");
                break;
            }
        } while (opcion == 1); // Se indica que continue ciclo en cuanto opción sea igual a uno un valor diferente generaria corte del ciclo
        System.out.println("Compra culminada");
        System.out.println("");    // Salto de Linea
        //Imprimo variables almacenadas en los metodos de la clase Factura
        System.out.println("Querido Usuario: " + f1.getNombreUsuario());
        System.out.println("Precio total articulos sin iva: $" + f1.getvSinIva());
        System.out.println("El iva con respecto a su compra es: $" + f1.getvIva());
        System.out.println("El total a pagar, iva incluido es: $" + f1.getTotal());
        System.out.println("Gracias por su compra!!");

    }
}
