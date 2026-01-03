package exercicios.comissoes_vendas;

import java.util.Scanner;

public class Questao710 {


    public static int calcularIndiceFaixa(double vendas ){

        return (int) ( 200 + vendas * 0.09) / 100;
    }
    
    public static void main(String[] args) {
        
        int[] contadores = new int[11];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < contadores.length; i++) {
            
            System.out.println("Digite o total vendido : ");

            double vendas = input.nextDouble();

            ++contadores[ calcularIndiceFaixa(vendas) > 10 ? 10: calcularIndiceFaixa(vendas) ];

        }

        for (int i = 2; i < contadores.length; i++) {
            

            if (i == 10) {

                System.out.printf("$%5d e acima:  \t%02d", 1000, contadores[i]);
                
            } else {

                System.out.printf("$%03d-%03d: \t\t%02d", i * 100, i * 100 + 99, contadores[i]);
            }

            System.out.println();
            
            
        }


    }
}
