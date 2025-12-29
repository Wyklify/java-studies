package exercicio.cara_coroa;

import java.security.SecureRandom;
import java.util.Scanner;

enum Coin {
    CARA, COROA
};

public class Questao629 {

    private static int contadorCara = 0;
    private static int contadorCoroa = 0;

    public static Coin flip() {

        SecureRandom sc = new SecureRandom();

        int valor = sc.nextInt(2);

        return valor == 0 ? Coin.CARA : Coin.COROA;
    }

    static void mostrarMenu() {

        System.out.println(" ** CARA OU COROA **");
        System.out.println("1. Toss Coin");
        System.out.println("2. Mostrar placar");

        System.out.print("Escolha: ");

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            mostrarMenu();

            String escolha = input.nextLine();

            switch (escolha) {

                case "1" -> {

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    Coin resultado = flip();

                    System.out.println(resultado);

                    if (resultado == Coin.CARA)
                        contadorCara++;
                    else
                        contadorCoroa++;
                }

                case "2" -> {

                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Placar!");
                    System.out.println("Cara: " + contadorCara);
                    System.out.println("Coroa: " + contadorCoroa);
                }

                default -> {return;}
            }

        }

    }
}
