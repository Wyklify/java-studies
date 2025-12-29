package exercicio.primos;

public class Questão625 {

    public static boolean isPrimo(int valor) {

        if (valor <= 1) {

            return false;
        }

        if (valor == 2) {
            return true;
        }

        if (valor % 2 == 0) {

            return false;
        }

        for (int i = 3; i <= Math.sqrt(valor); i += 2) {

            if (valor % i == 0) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        int contador = 0;

        for (int i = 0; i <= 10_000; i++) {

            if (isPrimo(i)) {

                System.out.printf("%-6d", i);

                contador++;

                if (contador % 5 == 0) {

                    System.out.println();
                }

            }

        }

    }
}