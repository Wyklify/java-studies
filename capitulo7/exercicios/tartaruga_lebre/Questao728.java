package exercicios.tartaruga_lebre;

import java.util.Arrays;

public class Questao728 {

    public static void main(String[] args) {

        String[] percurso = new String[70];
        Arrays.fill(percurso, " ");

        Animal tartaruga = new Tartaruga("T", 0, 0);
        Animal lebre = new Lebre("L", 0, 0);

        System.out.printf("BANG !!!!! %nE LÁ VÃO ELES !!!!!%n");


        for (int i = 0; i < 10000; i++) {

            int posAnterior = tartaruga.getPosicaoAtual();
            int novaPosicao = tartaruga.mover(posAnterior);

            inserirFigura(tartaruga, novaPosicao, posAnterior, percurso);

            tartaruga.setPosicaoAnterior(posAnterior);
            tartaruga.setPosicaoAtual(novaPosicao);            

            posAnterior = lebre.getPosicaoAtual();
            novaPosicao = lebre.mover(posAnterior);

            inserirFigura(lebre, novaPosicao, posAnterior, percurso);

            lebre.setPosicaoAnterior(posAnterior);
            lebre.setPosicaoAtual(novaPosicao);

            mostrarPercurso(percurso);

           // verificar vitoria

           if (tartaruga.getPosicaoAtual() >= 69 && lebre.getPosicaoAtual() >= 69) {
            System.out.println("OCORREU UM EMPATE");
            break;
           } else if( tartaruga.getPosicaoAtual() >= 69){
                verificarVitoria(tartaruga);
                break;
           } else if (lebre.getPosicaoAtual() >= 69) {
                verificarVitoria(lebre);
                break;
           }
            
            System.out.println();
            System.out.println();

        }

        // se terminou o loop e ninguém ganhou gera empate

        if (tartaruga.getPosicaoAtual() < 69 && lebre.getPosicaoAtual() < 69) {
            
            System.out.println("OCORREU UM EMPATE");
        }

    }


    public static void verificarVitoria(Animal animal){
        
        if (animal.getNome().equals("T")) {
            
            System.out.printf("%n A TARTARUGA VENCEU");
        } else {

            System.out.printf("%n A LEBRE VENCEU");
        }
    }

    // inserir posicao e validar se não tem outro animal lá
    public static void inserirFigura(Animal animal, int posicaoAtual, int posicaoAnterior, String[] percurso) {

        if (!" ".equals(percurso[posicaoAtual])) {

            percurso[posicaoAtual] = String.format("%s + %s -> AI!", percurso[posicaoAtual], animal.getNome());

        } else {

            percurso[posicaoAtual] = animal.getNome();
        }

        percurso[posicaoAnterior] = " ";
    }

    // método para mostrar as posicoes a cada loop
    public static void mostrarPercurso(String[] percurso) {

        for (String i : percurso) {

            System.out.printf("%s", i);
        }

    }
}
