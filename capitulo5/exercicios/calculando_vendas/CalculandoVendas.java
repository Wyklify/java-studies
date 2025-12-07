package calculando_vendas;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculandoVendas {
    

    static BigDecimal valor(int codigo, int quantidade) {

        BigDecimal precos = BigDecimal.ZERO;

        switch (codigo) {
            case 1:
                precos = BigDecimal.valueOf(2.98);
                break;
            case 2:
                precos = BigDecimal.valueOf(4.5);
                break;
            case 3:
                precos = BigDecimal.valueOf(9.98);
                break;
            case 4:
                precos = BigDecimal.valueOf(4.49);
                break;
            case 5:    
                precos = BigDecimal.valueOf(6.87);
                break;
            default:
                System.out.println("valores de 1 a 5");
                break;
        }    
        
        return precos.multiply(BigDecimal.valueOf(quantidade));
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        BigDecimal valorfinal = BigDecimal.ZERO;

        while (true) {

            System.out.print("Digite um codigo: ");
            int codigo = input.nextInt();

            System.out.print("Digite a quantidade: ");
            
            int quantidade = input.nextInt();
            
            input.nextLine();
            
            valorfinal =  valorfinal.add(CalculandoVendas.valor(codigo, quantidade));

            System.out.println("Deseja adicionar mais itens?");

            String escolha = input.nextLine();

            if (escolha.equals("N")) {                
                break;
            }

            
            
        }

        System.out.println("O valor do pedido: " + String.format("%,.2f", valorfinal) );
    }
    
}
