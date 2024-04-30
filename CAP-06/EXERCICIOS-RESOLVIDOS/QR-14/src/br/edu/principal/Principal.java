package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double novo_sal = 0;

        String nome[] = new String[5];
        double sal[] = new double[5];
        int quant[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            nome[i] = scanner.nextLine();
            sal[i] = scanner.nextDouble();
            quant[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            if (quant[i] <= 5 && sal[i] >= 800) System.out.println(nome[i]);
        }

        for (int i = 0; i < 5; i++) {
            if (quant[i] > 5 || sal[i] < 800) {
                if (quant[i] > 5 && sal[i] < 800) {
                    novo_sal = sal[i] + sal[i] * 25 / 100;
                }
                else {
                    novo_sal = sal[i] + sal[i] * 15 / 100;
                }

                System.out.println(nome[i] + ", " + novo_sal);
            }
        }
    }
}