package exercicio.invertendo_digitos;

public class Questao626 {

    public static String inverter(int valor) {

        StringBuilder sb = new StringBuilder();

        while (valor > 0) {

            int novo = valor % 10;

            sb.append(novo);

            valor = valor / 10;

        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(  Integer.parseInt(inverter(1367)) );

    }
}
