package somatorio;

import java.util.ArrayList;
import java.util.List;

public class Somatorio {
    
    static Integer somaImpar(List<Integer> lista) {

        int somatorio = 0;

        for (Integer elementos : lista) {            

            if (elementos %2 != 0 ) {
                
                somatorio += elementos;
            }

        }
        return somatorio;
    }

    static double potencia(double valor, double potencia) {

        return Math.pow(valor, potencia);
    }


    static void mostrarInteiros(){

        int i = 1;
        while (i <= 20) {

            System.out.print(i + "\t");

            if (i%5 == 0) {
                
                System.out.println();
            }
            
            i++;
        }
    }

    public static void main(String[] args) {

        Somatorio.mostrarInteiros();

        List<Integer> lista = new ArrayList<>();

        for(int i=1; i <= 99; i++) {

            lista.add(i);
        }

        System.out.println(Somatorio.somaImpar(lista));
    }


}
