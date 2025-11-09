package saida_formato_tabela;

public class formatar {


    public static void main(String[] args) {


         for (int i = 1; i <= 5 ; i ++) {

            System.out.println( i + " \t" +
                                 i * 10 + "\t" + 
                                 i * 100 + "\t" +
                                 i * 1000 + "\t");
        }


        int row = 10;

        while (row >= 1) {
            int column = 1;

            while (column <= 10) {
                // Se o número da linha for ímpar, imprime '<', senão imprime '>'
                System.out.print(row % 2 == 1 ? "<" : ">");
                column++;
            }

            System.out.println(); // Pula para a próxima linha
            row--;
        }
        
    }
    
    

    


}
