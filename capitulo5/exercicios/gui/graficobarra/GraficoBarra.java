package gui.graficobarra;

import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class GraficoBarra extends JPanel {

    private List<Integer> escolha;

    public GraficoBarra(List<Integer> entradas) {
        this.escolha = entradas;
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < escolha.size(); i++) {

            int valor = escolha.get(i);

            g.drawString(DesenhaAsterisco.desenha(valor), 50, 50 + i * 20);

        }

    }

}
