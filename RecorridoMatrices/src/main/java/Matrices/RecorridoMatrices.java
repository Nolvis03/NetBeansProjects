package Matrices;

public class RecorridoMatrices {

    public static void main(String[] args) {
        String marcas[][];
        marcas = new String[2][2];
        marcas[0][0] = "Puto";
        marcas[0][1] = "el";
        marcas[1][0] = "que";
        marcas[1][1] = "lo lea...";

        System.out.println("Tamaño columnas: " + marcas[0].length);
        System.out.println("Tamaño Renglones: " + marcas.length);

        for (int i = 0; i < marcas.length; i++) {
            for (int j = 0; j < marcas[i].length; j++) {
                System.out.println("Posición: " + i + " - " + j + " = " + marcas[i][j]);
            }
        }
    }
}
