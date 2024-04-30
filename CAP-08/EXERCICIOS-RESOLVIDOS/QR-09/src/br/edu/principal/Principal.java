package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        maior_menor();
    }

    public static void maior_menor() {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite o " + i + "° número: ");
            int num = scanner.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            }
            else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }
        scanner.close();
        
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
    }
}
