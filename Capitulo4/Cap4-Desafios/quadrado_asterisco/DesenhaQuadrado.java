package quadrado_asterisco;

import java.util.Scanner;

public class DesenhaQuadrado {

    public static void main(String[] args) {

        System.out.print("Digite o lado do quadrado: ");

        Scanner input = new Scanner(System.in);

        int lado = input.nextInt();

        for (int i = 0; i < lado; i++) {

            for (int j = 0; j < lado; j++) {



                if ( i == 0 || i == lado - 1 || j == 0 || j == lado -1) System.out.print( "*");

                else System.out.print(" ");
            }

            System.out.println();
        }

    }

}
