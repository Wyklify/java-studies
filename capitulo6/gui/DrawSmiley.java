package gui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.SecureRandom;

public class DrawSmiley extends JPanel {

    // public void paintComponent(Graphics g) {

    // super.paintComponent(g);

    // g.setColor(Color.yellow);
    // g.fillOval(10, 10, 200, 200);

    // g.setColor(Color.black);
    // g.fillOval(55, 65, 30, 30);
    // g.fillOval(135, 65, 30, 30);

    // g.fillOval(50, 110, 120, 60);

    // g.setColor(Color.yellow);
    // g.fillRect(50, 110, 120, 30);

    // g.fillOval(50, 120, 120, 40);
    // }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        
        Color color1 = randonColor();
        Color color2 = randonColor();

        

        for (int i = 0; i < 5; i++) {

            int x = 20 * i;
            int y = 20 * i;
            int w = 200 - (40 * i);
            int h = 200 - (40 * i);

            g.setColor( i % 2 == 0 ? color1 : color2);            
            g.fillOval(x,y,w,h);

            g.setFont(new Font("Serif", Font.BOLD, 48));
            g.drawString("Feliz Natal!", 230, 100);

        }

    }

    public static Color randonColor() {

        SecureRandom sr = new SecureRandom();

        int r = sr.nextInt(255);
        int g = sr.nextInt(255);
        int b = sr.nextInt(255);

        return new Color(r, g, b);
    }

}
