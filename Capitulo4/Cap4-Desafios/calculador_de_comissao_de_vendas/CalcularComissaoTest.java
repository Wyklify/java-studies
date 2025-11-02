import java.util.Scanner;

public class CalcularComissaoTest {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ListaComissao lista = new ListaComissao();

        while (true) {

            System.out.print("Nome do item: ");
            String nome = input.nextLine().trim();         


            System.out.print("Quantidade vendida: ");
            int qtd = input.nextInt();

            System.out.print("Valor unitário: ");
            double valor = input.nextDouble();

            System.out.println("Deseja adcionar mais itens? S/N");
            String sair = input.next();

            input.nextLine();

            lista.add(nome, qtd, valor);

            if (sair.equals("N")) {
                break;
            }

        }


        lista.imprimir();

        CalcularComissao jeane = new CalcularComissao("Jeane");

        jeane.calcularComissao(lista);


    }

}
