import java.util.Scanner;
import javax.swing.JOptionPane;


public class HolaMundo {

     public static void main(String[] args) {
 System.out.println("");
                //Nos aparece un cuadro de dialogo
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        String bienvenido=JOptionPane.showInputDialog("Bienvenido "+nombre);
    }
}