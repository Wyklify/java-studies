package exercicio.formula_rand_intervalo;

import java.security.SecureRandom;

public class Questao613 {
    
    public static void main(String[] args) {
        
        SecureRandom sc = new SecureRandom();

        for (int i = 0; i < 5; i++) {
            
            int a = 2 + 2 * sc.nextInt(5);

            System.out.println(a);
        }

        for (int i = 0; i < 5; i++) {
            
            int a = 3 + 2 * sc.nextInt(5);

            System.out.println(a);
        }

         for (int i = 0; i < 5; i++) {
            
            int a = 6 + 4 * sc.nextInt(5);

            System.out.println(a);
        }
    }
}
