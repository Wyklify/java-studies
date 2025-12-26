package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;


public class AbstractColors extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (int i = 0; i < 10; i++) {

            SecureRandom sr = new SecureRandom();

            int tipo = 1 + sr.nextInt(2);

            int x = sr.nextInt(getWidth());
            int y = sr.nextInt(getHeight());

            int largura = 20 + sr.nextInt(200);
            int altura = 20 +  sr.nextInt(200);

            g.setColor(DrawSmiley.randonColor());

            if (tipo == 1) {

                g.fillOval(x, y, largura, altura);

            } else {
                g.fillRect(x, y, largura, altura);

            }

        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200,200);
    }

}
