package examen;

import java.util.Scanner;

public class Primo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días Ceinmark, soy Marta Gómez");
        System.out.print("Introduce un número para averiguar si es primo o no: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;
        String divisores = "";

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + " ";
                if (i != 1 && i != numero) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El " + numero + " es primo");
        } else {
            System.out.println("El " + numero + " no es primo");
            System.out.println("Los divisores del " + numero + " son: " + divisores);
        }
    }
}