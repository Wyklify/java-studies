package gui.graficobarra;

import java.util.List;

public class DesenhaAsterisco {
    
    static String desenha( int valor) {

        String a = ""; 

        for (int i = 0; i < valor; i++) {
            
            a += "*"; 
        }

        return a;
    }
}
