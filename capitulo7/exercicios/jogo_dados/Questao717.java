package exercicios.jogo_dados;

import java.util.Random;
import java.util.stream.IntStream;

public class Questao717 {

    private static final Random sc = new Random();
    private static int[] array = new int[13];

    public static Dado lancarDado(Dado dado){       

        dado.setLado(1 + sc.nextInt(6));

        return dado;
    }


    public static int somaDado(Dado um, Dado dois) {

        return um.getLado() + dois.getLado();
    }

    public static int maiorIndice(){

        return IntStream.range(0, array.length).reduce((i,j)-> array[i] >= array[j] ? i : j).getAsInt();
    }

    public static int menorIndice(){

        return IntStream.range(2, array.length).reduce((i,j)-> array[i] <= array[j] ? i : j).getAsInt();
    }

    public static void main(String[] args) {
        
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int i = 0; i < 36_000_000; i++) {

            lancarDado(dado1);
            lancarDado(dado2);            

            ++array[somaDado(dado1, dado2)];
        }

        for (int i = 2; i < array.length; i++) {
            

            System.out.printf("%2d%10d%n",i,array[i]);           

        }


        System.out.println("Indice com maior quantidade: " + maiorIndice());
        System.out.println("Indice com menor quantidade: " + menorIndice());
    }



    
}
