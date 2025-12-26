package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawnSmileyTest {

    public static void main(String[] args) {

        DrawSmiley panel = new DrawSmiley();
        AbstractColors painelColors = new AbstractColors();

        JFrame aplicacao = new JFrame();

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel, BorderLayout.CENTER);
        aplicacao.add(painelColors, BorderLayout.SOUTH);

        aplicacao.setSize(230, 250);
        aplicacao.setVisible(true);

        
    }
}
