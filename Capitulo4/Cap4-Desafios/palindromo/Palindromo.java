package palindromo;

public class Palindromo {


    static Boolean verificarPalindromo( int valor){

        int invertido = 0;

        int original = valor;

        while (valor > 0) {
            
            int digito = valor % 10;

            invertido = invertido *  10 + digito;

            valor /= 10;
        }

        return original == invertido;
    }


    


    public static void main(String[] args) {
        

        System.out.println(Palindromo.verificarPalindromo(123));
    }


    
    
}
