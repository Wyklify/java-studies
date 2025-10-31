import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        
        DrawPanel panel = new DrawPanel();

        JFrame appliacation = new JFrame();

        appliacation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appliacation.add(panel);
        appliacation.setSize(250, 250);
        appliacation.setVisible(true);
    }
}
