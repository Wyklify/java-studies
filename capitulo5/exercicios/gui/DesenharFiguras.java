package gui;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DesenharFiguras extends JPanel {

    private int escolha;

    public DesenharFiguras(int escolhaUsuario) {

        this.escolha = escolhaUsuario;

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {

            switch (escolha) {
                case 1:

                    g.drawRect(
                            10 + i * 10,
                            10 + i * 10,
                            50 + i * 50,
                            50 + i * 10);

                    break;
                case 2:
                    g.drawOval(
                            10 + i * 10,
                            10 + i * 10,
                            50 + i * 50,
                            50 + i * 10);
                    break;
                default:
                    break;
            }
        }
    }
}
