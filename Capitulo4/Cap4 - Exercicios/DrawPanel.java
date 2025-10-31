import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int largura = getWidth();
        int altura  = getHeight();

        int passos = 15;

        /* Seção Atv. 4.1

        for (int i = 0; i <= passos; i++) {
            int dx = (i * largura) / passos  ; // desloca da esquerda para a direita
            int dy = (i * altura)  / passos ; // desloca do topo para baixo

            // 1) Do canto superior esquerdo
            g.drawLine(0, 0, dx, altura - dy);

             

            // 2) Do canto superior direito
            g.drawLine(largura, 0, largura - dx, altura - dy);

            // 3) Do canto inferior esquerdo
            g.drawLine(0, altura, dx, dy);

            // 4) Do canto inferior direito
            g.drawLine(largura, altura, largura - dx, dy);
            
        }

        */

        // atv 4.2

        for (int i=0; i <15 ; i ++) {

            int dx = ( i + 1 ) * largura / passos;
            int dy = (i * altura) / passos;

            g.drawLine(0, dy, dx, altura);

            g.drawLine(largura, dy, largura - dx, altura);

            g.drawLine(0, altura - dy, dx, 0);

            g.drawLine(largura, altura - dy, largura - dx, 0);

           
        }

        
    }
}