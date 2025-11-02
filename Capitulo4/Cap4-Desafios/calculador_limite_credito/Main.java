/*
 * Calculador de limite de crédito
 * (int)variáveis: número da conta, saldo do inicio do mês, total de todos os itens cobrados,
 *             total de créditos aplicados, limite de crédito autorizado 
 * calcular novo saldo ( = saldo inicial + despesas - créditos)
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Qual o total de despesas do mes? ");
        int despesas = input.nextInt();

        System.out.printf("Qual o total de creditos do mes? ");
        int creditos = input.nextInt();


        Conta usuario = new Conta(123, 100, 200);

        usuario.setTotalDespesas(despesas);
        usuario.setTotalCredito(creditos);

        usuario.calcularNovoSaldo();

    }
    
}
