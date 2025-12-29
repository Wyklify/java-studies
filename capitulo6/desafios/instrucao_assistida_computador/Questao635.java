package desafios.instrucao_assistida_computador;

import java.security.SecureRandom;
import java.util.Scanner;

public class Questao635 {

    private static int numero;

    public static void desenharNumero(int valor1, int valor2) {

        System.out.printf("Quanto é %d vezes %d?\n", valor1, valor2);

        numero = valor1 * valor2;

    }

    public static int numeroRandom() {

        SecureRandom sc = new SecureRandom();
        return 1 + sc.nextInt(9);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            desenharNumero(numeroRandom(), numeroRandom());

            while (true) {

                System.out.print(": ");
                int entrada = input.nextInt();

                if (entrada == numero) {

                    System.out.println("Muito bem!");

                    break;

                } else {

                    System.out.println("Não. Por favor, tente de novo.");
                    continue;
                }
            }

        }
    }
}
