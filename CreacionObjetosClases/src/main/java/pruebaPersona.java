
public class pruebaPersona {

    public static void main(String[] args) {
        Persona n1 = new Persona();

        int resultado = n1.operarNumeros();
        n1.a= 8;
        n1.b= 2;
        System.out.println("resultado = " + n1.operarNumeros());

        Persona n2 = new Persona(7, 6);
        

    }

}
