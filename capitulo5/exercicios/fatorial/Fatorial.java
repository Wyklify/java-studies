package fatorial;

import java.math.BigInteger;

public class Fatorial {



    static BigInteger fatorial(int valor) {

        if (valor == 1) {
            
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(valor).multiply(fatorial(valor - 1));
    }



    public static void main(String[] args) {
        
    


        for(int i= 1; i <=100; i++) {


            System.out.println( i + "\t" + Fatorial.fatorial(i));
        }
    }
    
}
