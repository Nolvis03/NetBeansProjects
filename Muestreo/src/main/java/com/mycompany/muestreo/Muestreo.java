package com.mycompany.muestreo;

import java.util.Scanner;

public class Muestreo {

    public static void main(String[] args) {
        int prom1, prom2, prom3, prom4;
        int suma1 = 0;
        int suma2 = 0;
        int c;
        int pni = 0;
        int cni = 0;
        int pjo = 0;
        int cjo = 0;
        int pad = 0;
        int pvi = 0;
        int cad = 0;
        int cvi = 0;
        Scanner Entrada = new Scanner(System.in);
        c = 5;
        int[] edad = new int[c];
        int[] peso = new int[c];
        for (int i = 0, p = 0; i < c && p < c; i++, p++) {
            System.out.println("Ingrese su edad");
            edad[i] = Entrada.nextInt();
            suma1 = suma1 + edad[i];
            System.out.println("Ingrese su peso");
            peso[p] = Entrada.nextInt();
            suma2 = suma2 + peso[p];
            if (edad[i] < 13) {
                cni = cni + 1;
                pni = peso[p] + pni;
                prom1 = pni / cni;
                System.out.println("El promedio de la categoria de niños es " + prom1);
            } if ((edad[i] == 12) && (edad[i] < 30)) {
                cjo = cjo + 1;
                pjo = peso[p] + pjo;
                prom2 = pjo / cjo;
                System.out.println("El promedio de categoria Jovenes es :" + prom2);

            } if ((edad[i] == 30) && (edad[i] < 59)) {
                cad = cad + 1;
                pad = peso[p] + pad;
                prom3 = pad / cad;
                System.out.println("El promedio categoria Adultos es :" + prom3);

            } if (edad[i] >= 60) {
                cvi = cvi + 1;
                pvi = peso[p] + pvi;
                prom4 = pvi / cvi;
                System.out.println("El promedio categoria Viejos es: " + prom4);
            }

        }
    }
}
