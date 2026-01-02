package exercicios.desenhando_espirais;

import javax.swing.JFrame;

public class Questao71Test {

    public static void main(String[] args) {

        Questao71 panel = new Questao71();
        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel);
        aplicacao.setSize(500, 500);
        aplicacao.setVisible(true);
    }
}
