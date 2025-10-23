public class EmployeeTeste {
    void main() {

        Employee trabalhador1 = new Employee("Wyklify", "Jhonson", 10);
        IO.println("O funcionario " + trabalhador1.getNome() + " " + trabalhador1.getSobreNome() + " recebe R$: "
                + trabalhador1.getSalario() * 12 + " reais anuais");
        Employee trabalhador2 = new Employee("Willian", "Jhon", 20);
        IO.println("O funcionario " + trabalhador2.getNome() + " " + trabalhador2.getSobreNome() + " recebe R$: "
                + trabalhador2.getSalario() * 12 + " reais anuais");

        double a = trabalhador1.getSalario();
        a = a * 12 * ( 0.10);

        trabalhador1.setSalario(a);

        a = trabalhador2.getSalario();

        a = a * 12 * ( 0.10);
        trabalhador2.setSalario(a);

        IO.println("O funcionario " + trabalhador1.getNome() + " " + trabalhador1.getSobreNome() + " recebe R$: "
                + trabalhador1.getSalario() * 12 + " reais anuais");
        IO.println("O funcionario " + trabalhador2.getNome() + " " + trabalhador2.getSobreNome() + " recebe R$: "
                + trabalhador2.getSalario() * 12 + " reais anuais");

    }

}
