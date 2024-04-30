package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hora_i = scanner.nextInt();
        int min_i = scanner.nextInt();

        int hora_f = scanner.nextInt();
        int min_f = scanner.nextInt();
        scanner.close();

        int minutos = calculo(hora_i, min_i, hora_f, min_f);
        System.out.println(minutos);
    }

    public static int calculo(int h_i, int m_i, int h_f, int m_f) {
        if (m_f < m_i) {
            m_f += 60;
            h_f -= 1;
        }

        if (h_f < h_i) {
            h_f += 24;
        }

        int tot_m = m_f - m_i;
        int tot_h = h_f - h_i;
        int total = tot_h * 60 + tot_m;
        return total;
    }
}
