
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
//Constructores
//Vacio

    Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo=sueldo;
    }
 
//Metodos
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }
    
      
    public String toString(){
    return super.toString()+"Empleado ("+" idEmpleado= "+idEmpleado +", Sueldo:"+sueldo+')';
    }

}
