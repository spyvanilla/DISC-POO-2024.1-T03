package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[8];
        int i = 0;

        while (i < 8) {
            int aux = scanner.nextInt();

            int j = 0;
            while (j <= i && vet[j] < aux) {
                j++;
            }

            int z = i;
            while (z >= j + 1) {
                vet[z] = vet[z - 1];
                z--;
            }

            vet[j] = aux;
            i++;
        }
        scanner.close();

        for (i = 0; i < 8; i++) {
            System.out.println(vet[i]);
        }
    }
}