package exercicios.tartaruga_lebre;

import java.util.Random;

public class Lebre  extends Animal{

    public Lebre(String nome, int posicaoAtual, int posicaoAnterior) {
        super(nome, posicaoAtual, posicaoAnterior);
        //TODO Auto-generated constructor stub
    }

     @Override
    public int mover(int posicao) {
         Random rd = new Random();

        int novaPosicao = 1 + rd.nextInt(10);

        int resultado = 0;

        if (novaPosicao >= 1 && novaPosicao <= 2) {

            resultado = posicao;

        } else if (novaPosicao >= 3 && novaPosicao <= 4) {

            resultado = posicao + 9;

        } else if (novaPosicao == 5) {
            resultado = posicao - 12;
        } else if (novaPosicao >= 6 && novaPosicao <= 8) {

            resultado = posicao + 1;
        } else if(novaPosicao >= 9 && novaPosicao <= 10) {

            resultado = posicao - 2;
        }

        return resultado = Math.max(0, Math.min(69, resultado));
    }
    
}
