package exercicio.intervalo_rand;

import java.security.SecureRandom;

public class Questao612 {
    
    public static void main(String[] args) {
        
        SecureRandom sc = new SecureRandom();        

        for (int i = 0; i < 10; i++) {
            
            int a = 1 + sc.nextInt(2);
            System.out.println(a);
        }

        for (int i = 0; i < 10; i++) {
            
            int a = 1 + sc.nextInt(100);
            System.out.println(a);
        }

        for (int i = 0; i < 10; i++) {
            
            int a = sc.nextInt(10);
            System.out.println(a);
        }

        for (int i = 0; i < 10; i++) {
            
            int a = 1000 + sc.nextInt(113);
            System.out.println(a);
        }

        for (int i = 0; i < 10; i++) {
            
            int a = -1 + sc.nextInt(3);
            System.out.println(a);
        }

        for (int i = 0; i < 15; i++) {
            
            int a = -3 + sc.nextInt(15);
            System.out.println(a);
        }
    }
}
