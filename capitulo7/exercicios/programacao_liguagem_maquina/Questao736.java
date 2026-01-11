package exercicios.programacao_liguagem_maquina;

import java.util.Scanner;

public class Questao736 {

    // entrada e saida
    final int READ = 10;
    final int WRITE = 11;

    final int LOAD = 20;
    final int STORE = 21;

    final int ADD = 30;
    final int SUBTRACT = 31;
    final int DIVIDE = 32;
    final int MULTIPLY = 33;

    final int BRANCH = 40;
    final int BRANCHNEG = 41;
    final int BRANCHZERO = 42;
    final int HALT = 43;

    int[] memoria = new int[100];
    int acumulador = 0;
    int contadorInstrucao = 0;

    Scanner input = new Scanner(System.in);

    public void executar() {

        boolean rodando = true;

        while (rodando) {

            int instrucao = memoria[contadorInstrucao];
            int operacao = instrucao / 100; // retorna os dois primeiros numeros
            int operando = instrucao % 100; // retorna os dois ultimos numeros

            switch (operacao) {

                case 0 -> {
                }

                case READ -> {
                    System.out.println("Digite um número: ");
                    memoria[operando] = input.nextInt();
                }

                case WRITE -> {
                    System.out.println("Saída: " + memoria[operando]);
                }

                case STORE -> {

                    memoria[operando] = acumulador;
                }

                case LOAD -> {

                    acumulador = memoria[operando];
                }

                case ADD -> {
                    acumulador = acumulador + memoria[operando];
                }

                case SUBTRACT -> {
                    acumulador = acumulador - memoria[operando];
                }

                case MULTIPLY -> {
                    acumulador = acumulador * memoria[operando];
                }

                case DIVIDE -> {
                    acumulador = acumulador / memoria[operando];
                }

                case BRANCH -> {

                    contadorInstrucao = operando;
                    continue;
                }

                case BRANCHNEG -> {

                    if (acumulador < 0) {

                        contadorInstrucao = operando;
                        continue;
                    }

                    break;
                }

                case BRANCHZERO -> {

                    if (acumulador == 0) {

                        contadorInstrucao = operando;
                        continue;
                    }

                    break;
                }

                case HALT -> {
                    rodando = false;
                    System.out.println("Programa encerrado.");
                    break;
                }

                // default -> {
                // System.out.println("Operacao invalida.");
                // }

            }

            contadorInstrucao++;
        }
    }

    public static void main(String[] args) {

        Questao736 sml = new Questao736();

        sml.memoria[0] = 1000;
        sml.memoria[1] = 2150;


        sml.memoria[2] = 2050;

        sml.memoria[3] = 4210;
        sml.memoria[4] = 3151;
        sml.memoria[5] = 2150;

        sml.memoria[6] = 4002;
        sml.memoria[7] = 4300;
        // sml.memoria[8] = 4300;


        // sml.memoria[9]
        // sml.memoria[10]

        sml.memoria[51] = 1;
        sml.executar();
    }

}
