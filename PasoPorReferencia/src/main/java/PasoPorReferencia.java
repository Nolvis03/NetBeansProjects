
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.cambiarNombre("Carlos");
        System.out.println(persona.obtenerNombre());
        modificarPersona(persona);
        System.out.println("Nombre modificado : "+persona.obtenerNombre());
    }

    private static void modificarPersona(Persona p2) {
    p2.cambiarNombre("Puto él");
    }
}
 