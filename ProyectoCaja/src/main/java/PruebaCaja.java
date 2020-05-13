public class PruebaCaja {
public static void main(String[] args) {
   Caja entrada = new Caja();
   entrada.ancho =3;
   entrada.alto = 2;
   entrada.profundo= 6;
          
    System.out.println("el volumen es: "+entrada.calVolumen());
    
   
   
    Caja c2 = new Caja(6,2,6);
    System.out.println("el volumen de C2 es: "+c2.calVolumen());

 
}
    
}
