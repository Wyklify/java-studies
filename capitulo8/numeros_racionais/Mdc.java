package numeros_racionais;

public class Mdc {

    public static int mdc(int valor1, int valor2){

        while (valor2 != 0) {

            int resto = valor1 % valor2;
            valor1 = valor2;
            valor2 = resto;
            
        }

        return valor1;
    }
    
}
