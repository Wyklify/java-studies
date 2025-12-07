package produto_inteiros_impares;

public class ProdutoInteirosImpares {

    public static void mostrar(){

        double produto = 1;

        for (int i = 1; i <= 15; i++) {
            
            if (i%2 !=0) {
                
                produto *=   i;
            }
        }

        System.out.println(produto);
    }
    
    public static void main(String[] args) {
        
        ProdutoInteirosImpares.mostrar();
    }
}
