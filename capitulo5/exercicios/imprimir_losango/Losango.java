package imprimir_losango;

class Losango {

    public static void imprimir(int valor) {

        int tamanho = valor;

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho - i - 1; j++) {

                System.out.print(" ");

            }

            for (int j2 = 0; j2 < (2 * i + 1); j2++) {

                System.out.print("*");
            }

            System.out.println();

        }

         for (int i = tamanho -2; i >= 0; i--) {

            for (int j = 0; j < tamanho - i - 1; j++) {

                System.out.print(" ");

            }

            for (int j2 = 0; j2 < (2 * i + 1); j2++) {

                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Losango.imprimir(5);

    }
}
