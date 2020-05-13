
public class ContextoEstatico {
    public static void main(String[] args) {
        Auto a1 = new Auto("Chevrolet");
        Auto a2 = new Auto("Renault");
        Auto a3 = new Auto("Nissan");
        System.out.println("a1 = " + a1.getNombre()+ ", ID: "+a1.getIdAuto());
        System.out.println("a2 = " + a2.getNombre()+ ", ID: "+a2.getIdAuto());
        System.out.println("a2 = " + a3.getNombre()+ ", ID: "+a3.getIdAuto());
    
    }
}
