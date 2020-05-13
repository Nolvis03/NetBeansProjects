public class Persona {
int a;
int b;
//Construtor vacío 
public  Persona(){
    System.out.println("Validando datos constructor vacío");
}    
// Metodo    
 public int operarNumeros(){
 int mult = a*b;
 return mult;  
 }
 
public Persona(int edad, int puto){
a = edad;
b = puto;
    System.out.println("resultado es: "+(a*b));
}
     
    
}
