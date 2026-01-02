package exercicios.desenhando_espirais;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Questao71 extends JPanel {

    public void paintComponent(Graphics g) {

    super.paintComponent(g);

    int step = 10;
    int x = getWidth() / 2;
    int y = getHeight() / 2;

    for (int i = 0; i < 100; i++) {

    g.drawLine(x, y, x, y + step);
    y += step;

    g.drawLine(x, y, x - step, y);
    x -= step;

    step += i * 10 + 10;

    g.drawLine(x, y, x, y - step);
    y -= step;

    g.drawLine(x, y, x + step, y);
    x += step;

    step += i * 10 + 10;
    }

    }

    // @Override
    //  public void paintComponent(Graphics g) {
    //     int centerX = getWidth() / 2;
    //     int centerY = getHeight() / 2;

    //     int numIterations = 5;

    //     int arcWidth = 10;
    //     int arcGrowDelta = 30;

    //     for (int i = 0; i < numIterations; i++) {

    //         g.drawArc(centerX - arcWidth, centerY - arcWidth, 2 * arcWidth, 2 * arcWidth, 0, 180);
    //         arcWidth += arcGrowDelta;
    //         g.drawArc(centerX - arcWidth, centerY - arcWidth, 2 * arcWidth - arcGrowDelta, 2 * arcWidth, 180, 180);
    //     }
    // }

}
