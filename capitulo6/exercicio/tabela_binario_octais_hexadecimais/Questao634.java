package exercicio.tabela_binario_octais_hexadecimais;

public class Questao634 {

    public static String binario(int valor) {

        StringBuilder sb = new StringBuilder();

        while (valor != 0) {

            int resto = valor % 2;
            sb.insert(0, resto);
            valor = valor / 2;
        }

        return sb.toString();
    }

    public static String octal(int valor) {

        StringBuilder sb = new StringBuilder();

        while (valor != 0) {

            int resto = valor % 8;
            sb.insert(0, resto);
            valor = valor / 8;
        }

        return sb.toString();
    }

    public static String hexadecimal(int valor) {

        StringBuilder sb = new StringBuilder();

        while (valor != 0) {

            int resto = valor % 16;

            sb.insert(0, resto > 9 ? valorH(resto) : resto);
            valor = valor / 16;
        }

        return sb.toString();
    }

    private static String valorH(int valor) {

        String codigo = switch (valor) {

            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> "Inválido";
        };

        return codigo;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 256; i++) {

            System.out.printf("%-6d \t %-10s \t %-8s \t%-8s \n", i, binario(i), octal(i), hexadecimal(i));

        }
    }
}
