import java.util.Date;

public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Nolvis", 5000);
        e1.setDireccion("Calle 33 # 20 S");
        e1.setEdad(25);
        e1.setGenero('M');
        
        System.out.println(e1);
        
        Cliente c1 =new Cliente(new Date(),true);
        c1.setDireccion("Calle 33 # 33");
        c1.setEdad(23);
        c1.setNombre("Nolvis");
        System.out.println(c1);
        
    }
    
}
