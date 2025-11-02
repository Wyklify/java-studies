public class ListaFuncionario {

    BoxSalario inicio = null;
    BoxSalario fim = null;

    void add(String nome, double horasTrabalhas, double salarioHora ) {

        BoxSalario novo = new BoxSalario(nome, horasTrabalhas, salarioHora);

        if (inicio == null) {

            inicio = novo;
            fim = novo;

        } else {

            fim.prox = novo;
            fim = novo;
        }


    }
    
}
