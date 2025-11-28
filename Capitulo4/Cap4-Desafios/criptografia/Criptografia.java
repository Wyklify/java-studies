package criptografia;

public class Criptografia {

    int criptografar(int valor) {

        int unidade = ((valor % 10) + 7) % 10;
        int dezena = ((valor % 100 / 10) + 7) % 10;
        int centena = ((valor % 1000 / 100) + 7) % 10;
        int milhar = ((valor % 10000 / 1000) + 7) % 10;

        int valorFinal = (dezena * 1000) + (unidade * 100) + (milhar * 10) + (centena * 1);

        return valorFinal;
    }

    int descriptrografar(int valor) {

       int t1 = valor % 100 / 10;
       int t2 = valor % 10;
       int t3 = valor % 10000 / 1000;
       int t4 = valor % 1000 / 100;

       int d1 = ( t1 + 10 - 7) % 10;
       int d2 = ( t2 + 10 - 7) % 10;
       int d3 = ( t3 + 10 - 7) % 10;
       int d4 = ( t4 + 10 - 7) % 10;

        return d1 * 1000 + d2 * 100 + d3 * 10 + d4; 
    }

    public static void main(String[] args) {

        Criptografia numero = new Criptografia();

        System.out.println(String.format("%04d", numero.criptografar(1234)));

        System.out.println(String.format("%04d", numero.descriptrografar(189)));


    }

}
