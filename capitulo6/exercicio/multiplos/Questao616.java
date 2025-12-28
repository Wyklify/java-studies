package exercicio.multiplos;

public class Questao616 {
    
    public static boolean isMultiple(int a, int b){

        return Math.abs(b) % Math.abs(a) == 0;
    }


    public static void main(String[] args) {
        
        System.out.println( isMultiple(2, -4) );
    }
}
