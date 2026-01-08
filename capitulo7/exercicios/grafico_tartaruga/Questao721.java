package exercicios.grafico_tartaruga;

public class Questao721 {

    private static int ARRAY_SIZE = 20;
    private static int[][] floor = new int[ARRAY_SIZE][ARRAY_SIZE];

    public static void main(String[] args) {

        int[][] comandos = {
                { 2 },
                { 5, 5 },
                { 3 },
                { 5, 5 },
                { 3 },
                { 5, 5 },
                { 3 },
                { 5, 5 },
                { 1 },
                { 6 },
                { 9 }
        };

        lerComandos(comandos);
        
    }

    public static void lerComandos(int[][] comandos) {

        // posicao da tartaruga

        int linha = ARRAY_SIZE /2 ;
        int coluna = ARRAY_SIZE /2;
        int direcao = 0; // 0 = direita , 1 = baixo , 2 = esquerda, 3 = cima
        boolean canetaBaixada = false;

        for (int[] comando : comandos) {            

                switch (comando[0]) {
                    case 1 -> {
                        canetaBaixada = false;
                    }
                    case 2 -> { canetaBaixada = true;}
                    case 3 -> { direcao = (direcao + 1) %4;}
                    case 4 -> { direcao = (direcao +3) %4;}
                    case 5 -> {
                        int passos = comando[1];

                        for (int i = 0; i < passos; i++) {
                            
                            if (direcao == 0) coluna++;
                            else if( direcao == 1) linha++;
                            else if( direcao == 2) coluna--;
                            else if( direcao == 3) linha--;

                            if (canetaBaixada) {
                                
                                floor[linha][coluna] = 1;
                            }
                        }
                    }
                    case 6 -> {
                        for (int i = 0; i < ARRAY_SIZE; i++) {
                            
                            for (int j = 0; j < ARRAY_SIZE; j++) {
                                
                                System.out.print(floor[i][j] == 1 ? "*": " ");
                            }

                            System.out.println();
                        }
                    }

                    case 9 -> {
                        System.out.println("Programa encerrado.");
                        return;
                    }
                }

           

        }

    }

}
