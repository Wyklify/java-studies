package exercicios.desenhar_arcoiris;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawRainbow  extends JPanel{
    
    private final static Color VIOLET = new Color(128,0,128);
    private final static Color INDIGO = new Color(75,0,130);

    private Color[] colors = {
        Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE, Color.GREEN, Color.yellow, Color.ORANGE, Color.RED
    };


    public DrawRainbow() {

        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int radius = 20;

        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int i = colors.length; i > 0; i--) {
            
            g.setColor(colors[i - 1]);

            g.fillArc(centerX - i * radius, centerY - i * radius, i * radius * 2, i * radius * 2, 0, 180);
        }
    }
}
