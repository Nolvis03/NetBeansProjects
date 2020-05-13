public class Persona {

    private String nombre;
    private char genero;
    private int edad;
    private String direccion;

    //Constructores
    // Sin parametros
    public Persona (){}
    
    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    //Metodos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String toString(){
    return "Persona("+" Nombre: " +nombre+" Genero: "+genero+" edad: "+edad+" Dirección: "+direccion+")";
    }
}
