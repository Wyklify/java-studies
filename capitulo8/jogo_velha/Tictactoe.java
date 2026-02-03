package jogo_velha;

public class Tictactoe {

    private int QUANTIDADE_LINHA, QUANTIDADE_COLUNA;
    private Movimento[][] board;
    private int qtdMovimentoVitoria;

    public Tictactoe(int qUANTIDADE_LINHA, int qUANTIDADE_COLUNA, int qtdMovimentoVitoria) {

        if (qUANTIDADE_LINHA != qUANTIDADE_COLUNA) {

            throw new IllegalArgumentException("A quantidade de linhas precisa ser igual a quantidade de colunas.");
        }

        if (qtdMovimentoVitoria < 3) {

            throw new IllegalArgumentException(
                    "A quantidade de movimentos de um board precisa ser maior ou igual a 3.");
        }

        QUANTIDADE_LINHA = qUANTIDADE_LINHA;
        QUANTIDADE_COLUNA = qUANTIDADE_COLUNA;
        this.qtdMovimentoVitoria = qtdMovimentoVitoria;
        this.board = new Movimento[QUANTIDADE_LINHA][QUANTIDADE_COLUNA];

        resetarBoard();
    }

    public Movimento[][] getBoard() {
        return board;
    }

    public void fazerJogada(int linha, int coluna, Jogador jogador) {

        if ((linha < 0 || linha > QUANTIDADE_LINHA) || (coluna < 0 || coluna > QUANTIDADE_COLUNA)) {

            throw new IllegalArgumentException(
                    String.format("Jogada invalida! Valores precisam variar entre : (%d - %d) (%d - %d) ", 0,
                            this.QUANTIDADE_LINHA, 0, this.QUANTIDADE_COLUNA));
        }

        if (board[linha][coluna] == Movimento.EMPTY) {

            board[linha][coluna] = jogador.getJogador();
        }

    }

    public boolean verificarVitoria(int linha, int coluna, Jogador jogador) {

        return verificarVitoriaHorizontal(linha, coluna, jogador) || verificarVitoriaVertical(linha, coluna, jogador)
                || verificarVitoriaDiagonalDireita(linha, coluna, jogador)
                || verificarVitoriaDiagonalEsquerda(linha, coluna, jogador);

    }

    private boolean verificarVitoriaHorizontal(int linha, int coluna, Jogador jogador) {

        // verificar vitoria horizontal

        int contadorHorizontal = 1; // contador de jogadas

        // direita
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (coluna + i < board[linha].length && board[linha][coluna + i] == jogador.getJogador()) {

                contadorHorizontal++;
            } else
                break;
        }

        // esquerda
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (coluna - i >= 0 && board[linha][coluna - i] == jogador.getJogador()) {

                contadorHorizontal++;
            } else
                break;
        }

        return contadorHorizontal >= this.qtdMovimentoVitoria;

    }

    private boolean verificarVitoriaVertical(int linha, int coluna, Jogador jogador) {

        int contadorVertical = 1;

        // baixo

        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha + i < board.length && board[linha + i][coluna] == jogador.getJogador()) {

                contadorVertical++;
            } else
                break;
        }

        // cima

        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha - i >= 0 && board[linha - i][coluna] == jogador.getJogador()) {
                contadorVertical++;
            } else
                break;
        }

        return contadorVertical >= this.qtdMovimentoVitoria;
    }

    private boolean verificarVitoriaDiagonalDireita(int linha, int coluna, Jogador jogador) {

        int contadorDiagonal = 1;

        // diagonal subindo
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha - i >= 0 && coluna + i < board[linha].length
                    && board[linha - i][coluna + i] == jogador.getJogador()) {
                contadorDiagonal++;
            } else
                break;
        }

        // diagonal descendo
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha + i < board.length && coluna - i >= 0
                    && board[linha + i][coluna - i] == jogador.getJogador()) {
                contadorDiagonal++;
            } else
                break;
        }

        return contadorDiagonal >= this.qtdMovimentoVitoria;
    }

    private boolean verificarVitoriaDiagonalEsquerda(int linha, int coluna, Jogador jogador) {

        int contadorDiagonal = 1;

        // diagonal subindo
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha - i >= 0 && coluna - i >= 0
                    && board[linha - i][coluna - i] == jogador.getJogador()) {
                contadorDiagonal++;
            } else
                break;
        }

        // diagonal descendo
        for (int i = 1; i < this.qtdMovimentoVitoria; i++) {

            if (linha + i < board.length && coluna + i < board[linha].length
                    && board[linha + i][coluna + i] == jogador.getJogador()) {
                contadorDiagonal++;
            } else
                break;
        }

        return contadorDiagonal >= this.qtdMovimentoVitoria;
    }

    public void resetarBoard() {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                board[i][j] = Movimento.EMPTY;
            }
        }

    }

}
