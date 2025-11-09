package tabuleiro_damas;

import saida_formato_tabela.formatar;

public class Tabuleiro {
    
    void imprimirTabuleiro(){


        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 16; j++) {

                if ((i + j) % 2 == 0) {

                    System.out.print("*");
                    
                } else {

                    System.out.print(" ");
                }

                
            }

            System.out.println();

            
            
        }
    }

    public static void main(String[] args) {

        Tabuleiro a = new Tabuleiro();

        a.imprimirTabuleiro();
        
    }
}
