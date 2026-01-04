package exercicios.eliminacao_duplicatas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao712 {

    private static Integer[] array = new Integer[5];

    public static boolean isLido(int valor) {

        return Arrays.asList(array).contains(valor);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            int entrada = input.nextInt();

            if (entrada < 10 || entrada > 100) {

                System.out.println("Valor invalido (10 - 100).");
                i--;
                continue;
            }

            if (isLido(entrada)) {

                System.out.printf("O valor %d já foi lido.%n: ", entrada);
                i--;
                continue;
            }

            array[i] = entrada;

        }

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%d | ", array[i]);

        }

    }
}
