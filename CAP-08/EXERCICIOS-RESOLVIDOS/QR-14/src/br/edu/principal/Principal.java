package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[20];

        for (int x = 0; x < 10; x++) {
            while (vet1[x] < 0) {
                vet1[x] = scanner.nextInt();
            }
        }

        for (int x = 0; x < 10; x++) {
            while (vet2[x] < 0) {
                vet2[x] = scanner.nextInt();
            }
        }

        scanner.close();
        int cont = uniao(vet1, vet2, vet3);
        int x = 0;

        while (x <= cont) {
            System.out.println(vet3[x]);
        }
    }

    public static int uniao(int a[], int b[], int u[]) {
        int k = 0;
        int cont = 0;
        int i = 0;

        for (i = 0; i < 10; i++) {
            cont = 0;
            while (cont <= k && a[i] != u[cont]) cont++;

            if (cont == k) {
                u[k] = a[i];
                k++;
            }
        }

        for (i = 0; i < 10; i++) {
            cont = 0;
            while (cont < k && b[i] != u[cont]) cont++;
        }

        if (cont == k) {
            u[k] = b[i];
            k++;
        }

        return k;
    }
}
