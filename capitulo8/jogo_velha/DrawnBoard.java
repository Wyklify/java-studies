package jogo_velha;

public class DrawnBoard {

    public static void desenhar(Movimento[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                System.out.print("+---+ ");

            }
            System.out.println();
            

            for (int j = 0; j < board[i].length; j++) {

                System.out.printf("| %s | ", board[i][j] == Movimento.EMPTY ? " " : board[i][j]);

            }

            System.out.println();
            

            for (int j = 0; j < board[i].length; j++) {

                System.out.print("+---+ ");

            }

            System.out.println();
            

        }

    }

    public static void main(String[] args) {

        Tictactoe board = new Tictactoe(3, 3, 5);
        board.resetarBoard();
        desenhar(board.getBoard());

    }

}
