package menor_valor;

import java.util.HashMap;
import java.util.Map;

public class MenorValor {

    static int menorValor(int... valor) {

        int menor = valor[0];

        for (int d : valor) {

            if (d < menor) {

                menor = d;
            }

        }

        return menor;

    }


    public static void main(String[] args) {
        
        int a[] = new int[] { 1,2,0, -1};

       

        System.out.println( MenorValor.menorValor(a));
    }

}
