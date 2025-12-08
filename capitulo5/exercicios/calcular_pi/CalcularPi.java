package calcular_pi;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularPi {

    public static void main(String[] args) {

        BigDecimal dividendo = BigDecimal.valueOf(4);
        BigDecimal divisor = BigDecimal.ONE;
        BigDecimal resultado = BigDecimal.ZERO;

        MathContext mc = new MathContext(20);

        boolean sinal = true;

        int termos = 0;

        for (int i = 1; i <= 2_000_000; i++) {

            BigDecimal valor = dividendo.divide(divisor, mc);

            if (sinal) {

                resultado = resultado.add(valor);

            } else {

                resultado = resultado.subtract(valor);
            }

            divisor = divisor.add(BigDecimal.TWO);
            sinal = !sinal;

            BigDecimal alvo = BigDecimal.valueOf(3.14159);
            BigDecimal tolerancia = BigDecimal.valueOf(0.000001);

            if (resultado.subtract(alvo).abs().compareTo(tolerancia) < 0) {
                termos = i;
            }
        }

        System.out.println("Valor de pi: " + resultado);
        System.out.println("Quantidade de termos: " + termos);
    }

}
