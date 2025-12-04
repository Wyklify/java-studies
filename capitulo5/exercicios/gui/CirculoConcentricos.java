package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

public class CirculoConcentricos extends JPanel {

    private int escolha;

    public CirculoConcentricos(int escolha) {
        this.escolha = escolha;
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        // int x = 0;
        // int y = 0;

        // int tamanhoX = 0;
        // int tamanhoY = 0;

        double centroX = getWidth() / 2;
        double centroY = getHeight() /2;

        

        for (int i = 0; i < 90; i++) {

            switch (escolha) {
                case 1:
                  //  g.drawOval(x = (getWidth() - tamanhoX) / 2, y = (getHeight() - tamanhoY) / 2, tamanhoX = 10 + i * 10, tamanhoY = 10  + i * 10);

                  int raio = 10 + i * 10;
                  int cantoX = (int) (centroX - raio);
                  int cantoY = (int) (centroY - raio);
                  int diametro = 2 * raio;

                  g.drawOval(cantoX, cantoY, diametro, diametro);
                  
                    break;

                default:
                    break;
            }
        }
    }

}
