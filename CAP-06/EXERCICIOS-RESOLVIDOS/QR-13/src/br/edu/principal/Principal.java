package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vet[i] = scanner.nextInt();
        }
        scanner.close();

        boolean achou = false;
        for (int i = 0; i < 10; i++) {
            if (vet[i] > 50) {
                System.out.println(vet[i] + ", " + i);
                achou = true;
            }
        }

        if (achou == false) {
            System.out.println("Não existem números superiores a 50 no vetor");
        }
    }
}