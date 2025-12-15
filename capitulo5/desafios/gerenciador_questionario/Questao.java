package gerenciador_questionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Questao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Pergunta> perguntas = new ArrayList<>();

        while (true) {

            System.out.print("Digite uma pergunta: ");

            String pergunta = input.nextLine();

            System.out.print("Digite a resposta a pergunta: ");

            String resposta = input.nextLine();

            perguntas.add(new Pergunta(pergunta, resposta));

            System.out.print("Deseja adicionar mais perguntas? (S/N)");
            String escolha = input.nextLine();

            if (escolha.equals("N") || escolha.equals("n")) {

                break;
                
            }

        }

        // usar

        double valorPergunta = 100.0 / perguntas.size();
        double contadorAcerto = 0;

        while (!perguntas.isEmpty()) {

            int valor = new Random().nextInt(perguntas.size());

            System.out.println(perguntas.get(valor).getTexto());

            System.out.println("Sua resposta: ");

            String respostaUsurario = input.nextLine();

            if (respostaUsurario.equals(perguntas.get(valor).getReposta())) {

                contadorAcerto += valorPergunta;

            }

            perguntas.remove(valor);

        }

        if (contadorAcerto >= 100) {

            System.out.println("Excelente");

        } else if (contadorAcerto >= 80) {

            System.out.println("Muito bom");

        } else {

            System.out.println("Bora estudar mais");
        }

    }

}
