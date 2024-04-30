package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x[] = new int[5];
        int y[] = new int[5];
        int r[] = new int[10];

        for (int i = 0; i < 5; i++) {
            x[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (x[j] > x[j + 1]) {
                    int aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            y[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (y[j] > y[j + 1]) {
                    int aux = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = aux;
                }
            }
        }
        int j = 0;

        for (int i = 0; i < 5; i++) {
            r[j] = x[i];
            j++;
            r[j] = y[i];
            j++;
        }

        for (int i = 0; i < 10; i++) {
            for (j = 1; j <= 9; j++) {
                if (r[j] > r[j + 1]) {
                    int aux = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(y[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(r[i]);
        }
    }
}