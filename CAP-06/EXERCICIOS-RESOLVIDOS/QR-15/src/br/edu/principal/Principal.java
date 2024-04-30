package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean achou = false;

        int vet1[] = new int[10];
        int vet2[] = new int[10];
        
        for (int i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vet2[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < 10; i++) {
            achou = false;
            System.out.println(vet1[i]);

            for (int j = 0; j < 5; j++) {
                if (vet1[i] % vet2[j] == 0) {
                    System.out.println("Divisível por " + vet2[j] + " na posição " + (j + 1));
                    achou = true;
                }
            }
        }

        if (achou == false) {
            System.out.println("Não possui divisores no segundo vetor");
        }
    }
}
