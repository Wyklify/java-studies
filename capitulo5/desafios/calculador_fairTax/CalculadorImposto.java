package calculador_fairTax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadorImposto {
    

    public static void main(String[] args) {
        
        List<Double> despesas = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            
            System.out.print("Digite o valor da sua despesas:");
            double valor = input.nextDouble();
            input.nextLine();

            despesas.add(valor);

            System.out.print("Deseja adiconar mais despesas? (S/N) ");

            String escolha = input.nextLine();

            if (escolha.equals("N")) {
                
                break;
            }
        }

        double imposto = 0;
        for (Double double1 : despesas) {
            
            imposto += ( double1 * 0.23);
            
        }

        System.out.println("O imposto pago é : " + imposto);
        input.close();
    }
}
