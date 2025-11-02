public class CalcularSalario {
    
   public static ListaFuncionario calcularSalarios (ListaFuncionario lista) {
        

        BoxSalario aux = lista.inicio;

        while (aux != null) {


            if (aux.horasTrabalhadas <= 40)
            aux.salarioBruto = aux.salarioHora * aux.horasTrabalhadas;
            else {
                double horasExtras = aux.horasTrabalhadas - 40;
                double salarioNormal = 40 * aux.salarioHora;
                double salarioExtra = horasExtras * aux.salarioHora * 1.5;
                aux.salarioBruto = salarioNormal + salarioExtra;
            }
            

            aux = aux.prox;
            
        }

        return lista;
    }


    
}
