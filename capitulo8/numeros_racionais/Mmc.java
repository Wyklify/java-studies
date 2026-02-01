package numeros_racionais;

public class Mmc {
    
    public static int mmc(int valor1, int valor2){

        return (valor1 * valor2 ) / Mdc.mdc(valor1, valor2);
    }
}
