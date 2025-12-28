package exercicio.quadrado_asteriscos;

public class Questao618 {
    
    public static void squareOfAsterisks(int side, String fill){

        for (int i = 0; i < side; i++) {
            
            System.out.println( desenharLinha(side,fill));
            
        }
    }

    public static String desenharLinha(int linha, String fill) {

        String a = fill;

        for (int i = 0; i < linha; i++) {
            
            a += fill; 
        }

        return a;
    }


    public static void main(String[] args) {
        
        squareOfAsterisks(4,"#");
    }
}
