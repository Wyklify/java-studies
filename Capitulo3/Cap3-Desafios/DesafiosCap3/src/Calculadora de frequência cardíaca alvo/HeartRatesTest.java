import java.util.Scanner;

public class HeartRatesTest {

    void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");        
        String nome = input.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Digite seu mes de nascimento: ");
        int mesNascimento = input.nextInt();

        System.out.print("Digite seu dia de nascimento: ");
        int diaNascimento = input.nextInt();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt();

        HeartRates pressao = new HeartRates(nome,sobrenome, mesNascimento, diaNascimento, anoNascimento);

       pressao.exibirInfor();



    }
    
}
