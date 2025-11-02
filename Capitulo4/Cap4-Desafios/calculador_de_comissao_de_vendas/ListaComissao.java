public class ListaComissao {

    Box inicio = null;
    Box fim = null;

    public void add (String nome, int quantItens,  double valor) {
        
        Box novo = new Box(quantItens, nome, valor);

        if (inicio == null) {

            inicio = novo;
            fim = novo;

        } else {

            fim.prox = novo;
            fim = novo;
        }

                
    }

    void imprimir () {

        System.out.println("========================================");
        System.out.println("            LISTA DE VENDAS");
        System.out.println("========================================");

        Box aux = inicio;

        int contador = 1;

        while (aux != null) {

            System.out.printf("%d. %s - %d - R$%.2f",contador, aux.nome, aux.quantidadeItem, aux.valor);
            aux = aux.prox;
            contador++;

            System.out.println();
            
        }
    }




    
}
