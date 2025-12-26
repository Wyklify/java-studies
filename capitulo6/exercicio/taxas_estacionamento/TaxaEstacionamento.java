package exercicio.taxas_estacionamento;

public class TaxaEstacionamento {

    public static double calculateCharges(int horas) {

        double valorFixo = 2.00;
        double valorVariavel = 0;

        if (horas <= 3) {

            valorVariavel = 0;

        } else if (horas < 24) {

            double horasExtras = horas - 3;
            valorVariavel = horasExtras * 0.5;

            double total = valorFixo + valorVariavel;

            return Math.min(total, 10);

        } else {

            return 10;
        }

        return valorFixo + valorVariavel;

    }

    public static void main(String[] args) {

        System.out.println(calculateCharges(5));
    }

}
