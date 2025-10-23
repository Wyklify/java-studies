package CalculadoraSoma;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

       

       

        String valor1 = "";
        String valor2 = "";
        boolean numeroInvalido = false;

        while (!numeroInvalido) {    
            
            

            if (valor2 == null) {
                return;               
            }
        

            try {
                valor1 = JOptionPane.showInputDialog("Insira um valor!");

                if (valor1 == null) {

                return;
                
            }
                valor2 = JOptionPane.showInputDialog("Insira um valor!");

                
            if (valor2 == null) {
                return;               
            }
        

                Integer.parseInt(valor1);
                Integer.parseInt(valor2);

                numeroInvalido = true;
                 
            } catch (NumberFormatException e) {
                // TODO: handle exception

                JOptionPane.showMessageDialog(null, "Insira apenas numeros inteiros");
            }

        }
       

        int valorSomar = Integer.parseInt(valor1) + Integer.parseInt(valor2);

        String menssagem = String.format("%d + %d = %d", Integer.parseInt(valor1), Integer.parseInt(valor2),
                valorSomar);

        JOptionPane.showMessageDialog(null, menssagem);

    }
}
