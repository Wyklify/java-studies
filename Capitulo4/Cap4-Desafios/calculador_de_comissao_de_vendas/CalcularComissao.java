public class CalcularComissao {

    // private int quantidadeTotalVendida;

    private String nomeVendedor;

    

    public CalcularComissao(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }



    public void calcularComissao(ListaComissao lista) {

        double valorTotalDeVendas = 0;
        double comissao = 200;

        Box aux = lista.inicio;

        while (aux != null) {

            valorTotalDeVendas += (aux.quantidadeItem * aux.valor);

            aux = aux.prox;

        }

        comissao += (valorTotalDeVendas * 0.09);

        System.out.println("========================================");
        System.out.println("            COMISSÃO");
        System.out.println("========================================");

        System.out.printf("O vendedor %s, vendeu R$%.2f gerando uma comissao de R$%.2f", nomeVendedor,valorTotalDeVendas,
                comissao);

    }

}
