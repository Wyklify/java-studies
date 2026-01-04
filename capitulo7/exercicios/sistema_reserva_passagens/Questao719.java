package exercicios.sistema_reserva_passagens;

import java.util.Scanner;

public class Questao719 {

    private static boolean[] poltronas = new boolean[11];

    static Scanner input = new Scanner(System.in);

    public static void reservar(int classe) {

        int inicio = classe == 1 ? 1 : 6;
        int fim = classe == 1 ? 5 : 10;

        if (!isDisponivel(inicio, fim)) {

            System.out.printf("Sem reserva disponível para %s %n", classe == 1 ? "Primeira classe" : "Economica");

            int outraClasse = classe == 1 ? 2 : 1;
            int outroInicio = outraClasse == 1 ? 1 : 6;
            int outroFim = outraClasse == 1 ? 5 : 10;

            if (isDisponivel(outroInicio, outroFim)) {

                System.out.printf("Deseja reservar na %s? (s/n)%n", outraClasse == 1 ? "Primeira classe" : "Economica");
                String entrada = input.nextLine();

                if (entrada.equalsIgnoreCase("s")) {

                    reservar(outraClasse);

                    return;
                }

            }

            System.out.println("Next flight leaves in 3 hours");
            return;

        }

        for (int i = inicio; i <= fim; i++) {
            
            if (!poltronas[i]) {
                poltronas[i] = true;
                confirmarReserva(classe, i);
                break;
            }
        }
    }

    public static boolean isDisponivel(int inicio, int fim) {

        for (int i = inicio; i <= fim; i++) {
            if (!poltronas[i]) {
                return true;
            }
        }

        return false;
    }

    public static void confirmarReserva(int classe, int indice) {

        System.out.printf("A sua reserva foi confirmada na %s%n", classe == 1 ? "Primeira classe" : "Economica");
        System.out.printf("Sua poltrona é %2d%n", indice);

    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("Please type 1 for First Class");
            System.out.println("Please type 2 for Economy");

            int entrada = input.nextInt();
            input.nextLine();

            if (entrada != 1 && entrada != 2) {
                
                continue;
            }

            reservar(entrada);
        }

    }
}
