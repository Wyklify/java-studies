
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        
        // Pede nome do usuario
        String name = JOptionPane.showInputDialog("What's your name? ");

        // cria a mensagem

        String menssage = String.format("Welcome, %s, to Java Programming", name);

        JOptionPane.showMessageDialog(null, menssage);

    }
    
}
