package exercicio.adivinhe_numero;

import java.security.SecureRandom;
import java.util.Scanner;

public class Questao630 {

    private static int numero = 0;

    public static int numAdvinhar() {

        SecureRandom sc = new SecureRandom();

        return numero = 1 + sc.nextInt(1000);
    }

    public static void main(String[] args) {

        numAdvinhar();

        Scanner input = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 1000 \n:");
        while (true) {

            int escolha = input.nextInt();

            if (escolha == numero) {

                System.out.println("Parabéns");
                break;
                
            } else if (escolha > numero) {

                System.out.println("Muito alto. Tente novamente!");
            } else {

                System.out.println("Muito baixo.Tente novamente!");
            }

        }

    }
}
