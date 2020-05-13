package consola;
import java.util.Scanner;
import modelo.PerfilMedico;


public class CalculoPm {
 Scanner entrada = new Scanner (System.in);
    PerfilMedico persona = new PerfilMedico();{
    System.out.println("Digite su nombre");
    String nombre=entrada.nextLine();
    persona.establecerNombre(nombre);
    System.out.println("Digite su apellido");
    String apellido=entrada.nextLine();
    persona.establecerApellido(apellido);
    System.out.println("Digite su numero día de nacimiento  DD");
    int dia=entrada.nextInt();
    persona.establecerDia(dia);
    System.out.println("Digite su numero mes de nacimiento MM");
    int mes=entrada.nextInt();
    persona.establecerMes(mes);
    System.out.println("Digite su numero año de nacimiento AAAA");
    int año=entrada.nextInt();
    persona.establecerAño(año);
    System.out.println("Ingrese su estatura en metros:");
    int estatura = entrada.nextInt();
    persona.establecerestatura(estatura);
    System.out.println("Ingrese su peso en kilogramos numero entero:");
    int peso = entrada.nextInt();
    persona.establecerpeso(peso);
    System.out.println("Ingrese su sexo:");
    String sexo = entrada.nextLine();
    persona.establecerSexo(sexo);
        
    System.out.println();
    System.out.println("Calculando parte medico");
    System.out.println("Sexo: "+persona.obtenerSexo(sexo));
    System.out.println("Nombre Paciente: "+persona.obtenerNombre(nombre));
    System.out.println("Apellido Paciente: "+persona.obtenerApellido(apellido));
    System.out.println("Fecha Nacimiento:"+persona.obtenerDia(dia)+"/"+persona.obtenerMes(mes)+"/"+persona.obtenerAño(año));       
    System.out.println("Edad actual es: "+persona.operarEdad(año)+" Años");
    System.out.println("Estatura : "+persona.obtenerestatura(estatura)+"Centimetros");
    System.out.println("Peso : "+persona.obtenerpeso(peso)+"Kilogramos"); 
    System.out.println(persona.calcularIMC(peso,estatura));
    System.out.println(persona.rangoIMC());
    System.out.println(persona.obtenerFrecuencia(año)); 
}
}