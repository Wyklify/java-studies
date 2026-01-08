package exercicios.passeio_cavalo;

public class Questao722 {

    public static void main(String[] args) {

        int[][] board = new int[8][8];
        int[] horizontal = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] vertical = { -1, -2, -2, -1, 1, 2, 2, 1 };

        int[][] accessibility = {
                { 2, 3, 4, 4, 4, 4, 3, 2 },
                { 3, 4, 6, 6, 6, 6, 4, 3 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 4, 6, 8, 8, 8, 8, 6, 4 },
                { 3, 4, 6, 6, 6, 6, 4, 3 },
                { 2, 3, 4, 4, 4, 4, 3, 2 }
        };

        int currentRow = 4;
        int currentColumn = 4;

        int moveCount = 1;
        board[currentRow][currentColumn] = moveCount;

        boolean movePossible;

        do {
            movePossible = false;
            int melhorMovimento = -1;
            int minAccessibility = Integer.MAX_VALUE;

            for (int i = 0; i < 8; i++) {

                int[] next = proximaPosicao(currentRow, currentColumn, i, vertical, horizontal);

                if (isValidMove(next[0], next[1], board)) {

                    int accValue = accessibility[next[0]][next[1]];

                    if (accValue < minAccessibility) {
                        minAccessibility = accValue;
                        melhorMovimento = i;
                    }

                }

            }

            if (melhorMovimento != -1) {

                int[] next = proximaPosicao(currentRow, currentColumn, melhorMovimento, vertical, horizontal);

                currentRow = next[0];
                currentColumn = next[1];
                moveCount++;
                board[currentRow][currentColumn] = moveCount;
                movePossible = true;

                // após mover o cavalo para (currentRow, currentColumn)
                for (int i = 0; i < 8; i++) {
                    int[] adj = proximaPosicao(currentRow, currentColumn, i, vertical, horizontal);
                    if (isInside(adj[0], adj[1]) && board[adj[0]][adj[1]] == 0) {
                        accessibility[adj[0]][adj[1]]--;
                    }
                }

            }
        } while (movePossible && moveCount < 64);

        System.out.println("Movimentos realizados: " + moveCount);

        printBoard(board);

        for (int i = 0; i < 8; i++) {

            int[] next2 = proximaPosicao(currentRow, currentColumn, i, vertical, horizontal);

            boolean inside = isInside(next2[0], next2[1]);

            System.out.printf("move %d --> (%d,%d) %s%n", i, next2[0], next2[1], inside ? "OK" : "FORA");

            System.out.printf("move %d --> (%d,%d) %s%n", i, next2[0], next2[1],
                    isValidMove(next2[0], next2[1], board) ? "VALIDO" : "INVALIDO");
        }

    }

    public static void printBoard(int[][] board) {

        for (int[] linha : board) {

            for (int coluna : linha) {

                System.out.printf("%2d ", coluna);
            }

            System.out.println();
        }
    }

    public static boolean isInside(int row, int col) {

        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public static int[] proximaPosicao(int currentRow, int currentColumn, int moveNumber, int[] vertical,
            int[] horizontal) {

        int nextRow = currentRow + vertical[moveNumber];
        int nextColumn = currentColumn + horizontal[moveNumber];

        return new int[] { nextRow, nextColumn };
    }

    public static boolean isValidMove(int row, int col, int[][] board) {

        return isInside(row, col) && board[row][col] == 0;

    }
}
