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


    public static String mensagem(int inicio, int fim){

        SecureRandom sc = new SecureRandom();

       

        int valor  = inicio + sc.nextInt(fim);

        return switch(valor) {

            case 1 -> "Muito bom!";
            case 2 -> "Excelente!";
            case 3 -> "Bom trabalho!";
            case 4 -> "Mantenha um bom trabalho!";
            case 5 -> "Não. Por favor, tente de novo.";
            case 6 -> "Errado. Tente mais uma vez.";
            case 7 -> "Não desista!";
            default -> "Não. Continue tentando!";                       
            
        };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            desenharNumero(numeroRandom(), numeroRandom());

            while (true) {

                System.out.print(": ");
                int entrada = input.nextInt();

                if (entrada == numero) {

                    System.out.println( mensagem(1,4) );

                    break;

                } else {

                    System.out.println(mensagem(5,4));
                    continue;
                }
            }

        }
    }
}
