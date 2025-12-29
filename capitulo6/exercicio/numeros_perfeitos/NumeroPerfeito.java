package exercicio.numeros_perfeitos;

public class NumeroPerfeito {
    

    public static boolean isPerfect(int numero){

        int perfeito = 0;

        for (int i = 1; i <= numero / 2; i++) {
            
            if (numero % i == 0 ) {

                perfeito += i;
                
            }
        }

        return perfeito == numero;
    }


    public static void main(String[] args) {


        for (int i = 0; i <= 33550336; i++) {

           


            if (isPerfect(i)) {

                System.out.println( i + ": É perfeito! ");
                
            }

            
            
        }
        
        
    }

}
