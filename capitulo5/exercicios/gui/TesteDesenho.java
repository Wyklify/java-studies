package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteDesenho {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to drawn ovals");

        int escolha = Integer.parseInt(input);

        // DesenharFiguras painel = new DesenharFiguras(escolha);

        CirculoConcentricos painel = new CirculoConcentricos(escolha);

        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(300, 300);
        aplicacao.setVisible(true);

    }

}
