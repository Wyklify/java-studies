package gui.graficobarra;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int contador = 0;

        List<Integer> entradas = new ArrayList<>();

        while (contador < 5) {

            String input = JOptionPane.showInputDialog("Digite um valor entre 1 e 30");
            int valor = Integer.parseInt(input);

            if (valor < 1 || valor > 30) {

                JOptionPane.showMessageDialog(null, "Valor invalido");
                continue;

            }

            entradas.add(valor);
            contador++;

        }

        GraficoBarra grafico = new GraficoBarra(entradas);

        JFrame aplicacao = new JFrame();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(grafico);
        aplicacao.setSize(300, 300);
        aplicacao.setVisible(true);

    }

}
