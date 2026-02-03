package jogo_velha;

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(Movimento.X);
        Jogador jogador2 = new Jogador(Movimento.O);

        Tictactoe jogo = new Tictactoe(10, 10, 3);

        jogo.fazerJogada(2, 2, jogador2);
        DrawnBoard.desenhar(jogo.getBoard());
        System.out.println(jogo.verificarVitoria(2, 2, jogador2));

        jogo.fazerJogada(0, 0, jogador2);
        DrawnBoard.desenhar(jogo.getBoard());
        System.out.println(jogo.verificarVitoria(0, 0, jogador2));

        jogo.fazerJogada(1, 1, jogador2);        
        DrawnBoard.desenhar(jogo.getBoard());
        System.out.println(jogo.verificarVitoria(1, 1, jogador2));

    }

}
