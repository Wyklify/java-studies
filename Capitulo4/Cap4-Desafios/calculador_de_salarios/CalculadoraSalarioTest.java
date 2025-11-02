import java.util.Scanner;

public class CalculadoraSalarioTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ListaFuncionario salarios = new ListaFuncionario();

        while (true) {

            System.out.print("Qual o nome do funcionario?: ");
            String nome = input.nextLine().trim();

            System.out.print("Qual quantidade de horas trabalhadas: ");
            double qtdHoras = input.nextDouble();

            System.out.print("Qual o valor da hora trabalhada?: ");
            double valorHora = input.nextDouble();

            salarios.add(nome, qtdHoras, valorHora);

            System.out.println("Deseja adicionar mais funcionarios? (S/N)");
            String escolha = input.next();

            if (escolha.equals("N")) break;

            input.nextLine();
            
        }


        CalcularSalario.calcularSalarios(salarios);

        
       BoxSalario aux = salarios.inicio;

       while (aux != null) {

        System.out.println("=========================================================");
        System.out.println("Funcionário: " + aux.nome);
        System.out.println("Horas trabalhadas: " + aux.horasTrabalhadas);
        System.out.println("Salário Bruto: " + aux.salarioBruto);
        System.out.println("=========================================================");

        aux = aux.prox;
       }

       
        

        

    }
    
}
