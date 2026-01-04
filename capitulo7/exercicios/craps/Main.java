package exercicios.craps;

public class Main {

    public static void main(String[] args) {

        Craps jogo = new Craps();

        for (int i = 0; i < 1_000_000; i++) {

            jogo.fazerJogada();
        }

        jogo.relatorio();
    }

}
