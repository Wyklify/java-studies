package exercicios.desenhar_arcoiris;

import javax.swing.JFrame;

public class DranRainbowTest {

    public static void main(String[] args) {

        DrawRainbow panel = new DrawRainbow();
        JFrame aplicacao = new JFrame("Arco íris");

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel);
        aplicacao.setSize(400,250);
        aplicacao.setVisible(true);

    }

}
