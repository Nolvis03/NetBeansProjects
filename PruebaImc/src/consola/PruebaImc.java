package consola;
import java.util.Scanner;

public class PruebaImc {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nombre;
    Double estatura,imc;
    int peso;
    System.out.println("Digite su nombre");
    nombre = entrada.nextLine();
    System.out.println("Digite su peso en Kilogramos");
    peso = entrada.nextInt();
    System.out.println("Digite su estatura en metros");
    estatura = entrada.nextDouble();
    imc = peso/(estatura*estatura);
    System.out.println();
    
    System.out.println("Nombre:"+nombre);
    System.out.println("Estatura:"+estatura+" Metros");
    System.out.println("Peso:"+peso+" Kilogramos");
    System.out.println("IMC ="+imc);
    if (imc<18.5){
    System.out.println(nombre+" está bajo de peso");}
    else if (imc<=24.9 && imc>=18.5){
    System.out.println(nombre+" está normal de peso");}
    else if (imc>=25 && imc<=29.9){
    System.out.println(nombre+" está en Sobrepeso");}
    else  {
    System.out.println(nombre+" está Obeso");}
    }
}
