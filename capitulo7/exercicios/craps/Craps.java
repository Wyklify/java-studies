package exercicios.craps;

import java.util.Random;

public class Craps {

    private int ponto;
    private static final Random sc = new Random();

    private Dado um = new Dado();
    private Dado dois = new Dado();

    int ARRAY_SIZE = 22;

    private int[] contadorVitoria = new int[ARRAY_SIZE];
    private int[] contadorDerrota = new int[ARRAY_SIZE];

    private Dado lancarDado(Dado dado) {

        dado.setFace(1 + sc.nextInt(6));
        return dado;
    }

    private int somarDados(Dado um, Dado dois) {

        return um.getFace() + dois.getFace();
    }

    public void fazerJogada() {

        int repeticoes = 1;

        lancarDado(um);
        lancarDado(dois);

        int pontuacao = somarDados(um, dois);

        // System.out.printf("%d + %d = %d", this.um.getFace(), this.dois.getFace(),
        // pontuacao);

        switch (pontuacao) {
            case 7, 11 -> {
                // System.out.println("Jogador Ganhou");
                ++contadorVitoria[repeticoes];
                return;
            }
            case 2, 3, 12 -> {
                // System.out.println("Jogador Perdeu!");
                ++contadorDerrota[repeticoes];
                return;
            }
            default -> ponto = pontuacao;
        }

        while (true) {

            repeticoes++;

            lancarDado(um);
            lancarDado(dois);

            int continua = somarDados(um, dois);

            if (continua == 7) {

                // System.out.println("Jogador Perdeu");
                this.contadorDerrota[repeticoes > 20 ? 21 : repeticoes]++;
                break;

            } else if (continua == this.ponto) {

                // System.out.println("Jogador Ganhou!");
                this.contadorVitoria[repeticoes > 20 ? 21 : repeticoes]++;
                break;
            }

        }

    }

    public void relatorio() {

        System.out.println("Quantidade de jogos ganhos por rolagem");

        for (int i = 1; i < this.contadorVitoria.length; i++) {

            System.out.printf("%02d.%,10d%n", i, this.contadorVitoria[i]);
        }

        System.out.println("Quantidade de jogos perdidos por rolagem");

        for (int i = 1; i < this.contadorDerrota.length; i++) {

            System.out.printf("%02d. %,10d%n", i, this.contadorDerrota[i]);
        }

        System.out.println("Chances de vitoria");

        int totalVitoria = 0, totalDerrotas = 0;

        for (int i = 1; i < ARRAY_SIZE; i++) {

            totalVitoria += contadorVitoria[i];
            totalDerrotas += contadorDerrota[i];
        }

        int totalJogos = totalVitoria + totalDerrotas;

        double taxaVitoria = totalJogos > 0 ? (double) totalVitoria / totalJogos * 100 : 0.0;

        System.out.printf("Em %,d de jogos a taxa de vitoria é: %.2f%%%n", totalJogos, taxaVitoria);

        // bugado

        int totalJogos2 = 0;
        long somaTurnos = 0;

        for (int i = 1; i < ARRAY_SIZE; i++) {
            int jogosPorTurno = contadorVitoria[i] + contadorDerrota[i];
            totalJogos2 += jogosPorTurno;
            somaTurnos += (long) i * jogosPorTurno;
        }

        double mediaTurnos = (double) somaTurnos / totalJogos2;

        System.out.printf("A média de duracao de um jogo é: %.2f turnos. Em %,d jogos", mediaTurnos,totalJogos2);

    }

}
