package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 0;

        int voo[] = new int[12];
        String origem[] = new String[12];
        String destino[] = new String[12];
        int lugares[] = new int[12];

        for (int i = 0; i < 12; i++) {
            voo[i] = scanner.nextInt();
            origem[i] = scanner.nextLine();
            destino[i] = scanner.nextLine();
            lugares[i] = scanner.nextInt();
        }

        while (op != 3) {
            System.out.println("1- Consultar");
            System.out.println("2- Reservar");
            System.out.println("3- Finalizar");
            System.out.println("Digite sua opção: ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.println("1- Consulta por voo");
                System.out.println("2- Consulta por origem");
                System.out.println("3- Consulta por destino");
                System.out.println("Digite sua opção: ");
                int op2 = scanner.nextInt();

                if (op2 == 1) {
                    System.out.println("Digite o número de voo: ");
                    int num_voo = scanner.nextInt();
                    int i = 0;

                    while (i < 12 && voo[i] != num_voo) {
                        i++;
                    }

                    if (i == 12) {
                        System.out.println("Voo inexistente");
                    }
                    else {
                        System.out.println("Número de voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }

                if (op2 == 2) {
                    System.out.println("Digite o local de origem: ");
                    String local = scanner.nextLine();

                    for (int i = 0; i < 12; i++) {
                        if (local == origem[i]) {
                            System.out.println("Número do voo " + voo[i]);
                            System.out.println("Local de origem " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }

                if (op2 == 3) {
                    System.out.println("Digite o local de destino: ");
                    String local = scanner.nextLine();

                    for (int i = 0; i < 12; i++) {
                        if (local == destino[i]) {
                            System.out.println("Número do voo " + voo[i]);
                            System.out.println("Local de origem " + origem[i]);
                            System.out.println("Destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                        }
                    }
                }
            }

            if (op == 2) {
                System.out.println("Digite o número do voo desejado: ");
                int num_voo = scanner.nextInt();
                int i = 0;

                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }

                if (i == 12) {
                    System.out.println("Número de voo não encontrado");
                }
                else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado");
                    }
                    else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }
        }

        scanner.close();
    }
}
