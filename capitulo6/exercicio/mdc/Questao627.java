package exercicio.mdc;

public class Questao627 {

    public static int mdc(int a, int b) {

        int primeiroTermo = Math.max(a, b);
        int segundoTermo = Math.min(a, b);

        

        while (primeiroTermo % segundoTermo != 0) {
            
            int resto = primeiroTermo % segundoTermo;

            primeiroTermo = segundoTermo;
            segundoTermo = resto;

            

        }

        return segundoTermo;
    }

    public static void main(String[] args) {
        
        System.out.println( mdc(10, 5));
    }

}
