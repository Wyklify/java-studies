package grafico_barras;

import java.util.Scanner;

import criar_triangulos.Triangulos;

public class GraficoBarras {
    

    public static void grafico( int... valor) {

        for (int i = 0; i < valor.length; i++) {
            
            System.out.println( Triangulos.montar(valor[i]));
        }

        
    }



    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] a  = new int[5];

        int i = 0;

        do {

            System.out.print("Digite um valor: ");
            int valor = input.nextInt();

            if (valor < 1 || valor > 30) {
                continue;
            }

            a[i] = valor;

            i++;

        } while(i < 5);

        grafico(a);

    }

}
