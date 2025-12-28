package exercicio.separando_digitos;

public class Questao621 {

    public static int separarInteiro(int valor, int valor2) {

        return (int) (valor / valor2);
    }

    public static int separarResto(int valor, int valor2) {

        return (int) (valor % valor2);
    }

    public static void displayDigits(int valor) {

        String somador = "";

        while (valor > 0) 
            
         {

            somador = String.format("  %d", separarResto(valor, 10)) + somador;

            valor = separarInteiro(valor, 10);            

        }

        System.out.println(somador);
    }

    public static void main(String[] args) {

        displayDigits(999998887);

    }

}
