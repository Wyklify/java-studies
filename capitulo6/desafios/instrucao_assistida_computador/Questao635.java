package desafios.instrucao_assistida_computador;

import java.security.SecureRandom;
import java.util.Scanner;

public class Questao635 {

    private static double numero;

    public static double desenharNumero(int valor1, int valor2, int operacao) {

        SecureRandom sc = new SecureRandom();

        int operador = (operacao >= 1 && operacao <= 4) ? operacao : 1 + sc.nextInt(4);


        System.out.printf("Quanto é %d %s %d?\n", Math.max(valor1, valor2), conversor(operador), Math.min(valor1, valor2));


        return numero = switch(operador) {
            case 1 -> valor1 + valor2;
            case 2 -> Math.max(valor1, valor2) - Math.min(valor1, valor2);
            case 3 -> valor1 * valor2;
            case 4 -> (double) Math.max(valor1, valor2) / Math.min(valor1, valor2);
            default -> 0;
        };

    }

    private static String conversor(int operacao){

        String[] simbolos = {"+","-","X","/"};

        return simbolos[operacao -1];
    }



    public static int numeroRandom( int multiplicador) {

        SecureRandom sc = new SecureRandom();

        int minimo = (int) Math.pow(10, multiplicador - 1);
        int maximo = (int) Math.pow(10, multiplicador) - 1;

        return minimo + sc.nextInt(maximo - minimo + 1);
    }

    public static String mensagem(int inicio, int fim) {

        SecureRandom sc = new SecureRandom();

        int valor = inicio + sc.nextInt(fim);

        return switch (valor) {

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

        int respostaCorreta = 0;
        int respostaIncorreta = 0;
        int contador = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tipo de problema deseja? \n1.Adição \t2.Subtração \t3.Nultiplicação \t4.divisão \t5.Aleatório");
        int tipo = input.nextInt();
        input.nextLine();

        System.out.println("Qual nivel de dificuldade deseja? (1 - 10)");
        int dificuldade =  input.nextInt();    

        input.nextLine();

        


        while (contador < 10) {

            desenharNumero(numeroRandom(dificuldade), numeroRandom(dificuldade), tipo);

            while (true) {

                System.out.print(": ");
                int entrada = input.nextInt();

                if (entrada == numero) {

                    respostaCorreta++;
                    contador++;

                    System.out.println(mensagem(1, 4));

                    break;

                } else {

                    respostaIncorreta++;
                    contador++;
                    System.out.println(mensagem(5, 4));

                    if (contador == 10) {

                        break;
                    }

                }

            }

        }

        System.out.println("Resultado!");
        System.out.println("Quantidade de acertos:  " + respostaCorreta);
        System.out.println("Quantidade de erros:  " + respostaIncorreta);

        if (((double) respostaCorreta / contador * 100) >= 75) {

            System.out.println("Parabéns, você está pronto para avançar para o próximo nível!");
        } else {
            System.out.println("Peça ajuda extra ao professor.");
        }

        contador = 0;
        respostaCorreta = 0;
        respostaIncorreta = 0;
    }
}
