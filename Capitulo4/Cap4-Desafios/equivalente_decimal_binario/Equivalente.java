package equivalente_decimal_binario;

public class Equivalente {

   static public int converterBinario(int valor) {

        int decimal = 0;
        int potencia = 1;

        while (valor > 0) {

            int digito = valor % 10;

            decimal += (digito * potencia);

            potencia *= 2;

            valor /= 10;
            
        }

        return decimal;
    }

    public static void main(String[] args) {

        

        System.out.println(Equivalente.converterBinario(001));

    }
}
