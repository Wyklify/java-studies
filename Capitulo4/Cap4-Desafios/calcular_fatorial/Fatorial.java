package calcular_fatorial;

public class Fatorial {

    int fatorial(int valor) {

        if (valor == 0) {

            return 1;

        }

        return valor * fatorial(valor - 1);
    }

    double calcularE(int valor) {

        double e = 1.0;

        for (int i = 1; i <= valor; i++) {

            e = e + (1.0 / fatorial(i));
        }

        return e;
    }

    double calcularEx(int valor, int termos) {

        double e = 1.0;

        for (int i = 1; i <= termos; i++) {

            e = (e + (Math.pow(valor, i) / fatorial(i)));
        }

        return e;
    }

    public static void main(String[] args) {

        Fatorial f = new Fatorial();

        System.out.println("e ≈ " + String.format("%.2f", f.calcularE(10))                         );
        System.out.println("e^2 ≈ " + f.calcularEx(2, 10));

    }

}
