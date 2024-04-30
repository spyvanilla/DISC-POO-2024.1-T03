package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet[] = new int[5];
        for (int x = 0; x < 5; x++) vet[x] = scanner.nextInt();
        scanner.close();
        ordena(vet);

        for (int x = 0; x < 5; x++) {
            System.out.println(vet[x]);
        }
    }

    public static void ordena(int v[]) {
        for (int x = 0; x < 5; x++) {
            for (int j = 0; j < 4; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}
