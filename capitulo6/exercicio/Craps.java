package exercicio;
import java.security.SecureRandom;

public class Craps {

    private static final SecureRandom numeroRandom = new SecureRandom();

    private enum Status {
        CONTINUE, VENCEU, PERDEU
    };

    private static final int olhoCobra = 2;
    private static final int tres = 3;
    private static final int sete = 7;
    private static final int onze = 11;
    private static final int doze = 12;

    public static void main(String[] args) {

        int meusPontos = 0;

        Status gameStatus;

        int somaDado = rolarDato();

        switch (somaDado) {
            case sete, onze -> gameStatus = Status.VENCEU;
            case olhoCobra, tres, doze -> gameStatus = Status.PERDEU;
            default -> {
                gameStatus = Status.CONTINUE;
                meusPontos = somaDado;
                System.out.println("Pontos " + meusPontos);
            }
        }

        while (gameStatus == Status.CONTINUE) {

            somaDado = rolarDato();

            if (somaDado == meusPontos) {

                gameStatus = Status.VENCEU;
            } else {

                if (somaDado == sete) {
                    gameStatus = Status.PERDEU;
                }
            }

        }

        if (gameStatus == Status.VENCEU) {

            System.out.println("Jogador Venceu");

        } else {
            System.out.println("Jogador Perdeu");
        }
    }

    private static int rolarDato() {

        int dado1 = 1 + numeroRandom.nextInt(6);
        int dado2 = 1 + numeroRandom.nextInt(6);

        int soma = dado1 + dado2;

        System.out.println("Jogado rolou " + dado1 + "+" + dado2 + "=" + soma);

        return soma;
    }
}
