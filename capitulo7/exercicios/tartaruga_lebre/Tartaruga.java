package exercicios.tartaruga_lebre;

import java.util.Random;

public class Tartaruga extends Animal{

    public Tartaruga(String nome, int posicaoAtual, int posicaoAnterior) {
        super(nome, posicaoAtual, posicaoAnterior);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int mover(int posicao) {
         Random rd = new Random();

        int novaPosicao = 1 + rd.nextInt(10);

        int resultado = 0;

        if (novaPosicao >= 1 && novaPosicao <= 5) {

            resultado = posicao + 3;

        } else if (novaPosicao >= 6 && novaPosicao <= 7) {

            resultado = posicao - 6;
        } else if (novaPosicao >= 8 && novaPosicao <= 10) {

            resultado = posicao + 1;
        }

        return resultado = Math.max(0, Math.min(69, resultado));
    }
    
}
