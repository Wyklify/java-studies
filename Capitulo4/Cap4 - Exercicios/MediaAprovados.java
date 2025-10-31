import java.util.Scanner;

public class MediaAprovados {

    public static void main(String[] args) {

        int aprovacoes = 0;
        int reprovacoes = 0;
        int contador = 1;

        Scanner input = new Scanner(System.in);

        while (contador <= 10) {
            System.out.print("Inserir resultado: ");
            int resultado = input.nextInt();

            if (resultado == 1) {

                aprovacoes += 1;

            } else {
                reprovacoes += 1;
            }

            contador++;

        }

        System.out.printf("Aprovações: %d%n", aprovacoes);
        System.out.printf("Reprovações: %d%n", reprovacoes);

        if (aprovacoes > 8 ) {
            System.out.println("Bonus to instructor");
        }

        

    }
}