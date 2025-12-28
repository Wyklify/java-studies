package exercicio.exponenciacao;

public class Questao614 {
    
   static int intergerPower(int base, int expoente) {

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            
            resultado *= base;
        }

        return resultado;
    }



    public static void main(String[] args) {
        
        

        System.out.println( Questao614.intergerPower(2, 3) );
    }
}
