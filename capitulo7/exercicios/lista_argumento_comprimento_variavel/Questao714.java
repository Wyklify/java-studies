package exercicios.lista_argumento_comprimento_variavel;

import java.util.Arrays;

public class Questao714 {
    
    public static int product (int ... valores) {

        return Arrays.stream(valores).reduce(1, (a,b) -> a * b);
    }

    public static void main(String[] args) {
        
        System.out.println( product(10,10,10));
    }
}
