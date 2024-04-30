package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = "";

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();

        while (letra != "A" || letra != "P") {
            letra = scanner.nextLine();
        }

        scanner.close();
        float m = calcula_media(nota1, nota2, nota3, letra);

        if (letra == "A") {
            System.out.println("A média aritmética " + m);
        }
        else {
            System.out.println("A média ponderada " + m);
        }
    }

    public static float calcula_media(float n1, float n2, float n3, String l) {
        if (l == "A") return (n1 + n2 + n3) / 3;
        else return (n1 * 5 + n2 * 3 + n3 * 2) / (5 + 3 + 2);
    }
}