
public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        cambiarValor(x);
        System.out.println("x = " + x);
    }
// Constructor paso por valor
    private static void cambiarValor(int arg) // Variable int es local unicamente
    {
    arg=15;
        System.out.println("x = " + arg);
    }
}
