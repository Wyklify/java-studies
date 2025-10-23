

public class Employee {

    private String nome;
    private String sobreNome;
    private double salario;

    
    public Employee(String nome, String sobreNome, double salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salario = salario >= 0 ? salario: 0;
    }


    public String getNome() {
        return nome;
    }


    public String getSobreNome() {
        return sobreNome;
    }


    public double getSalario() {
        return salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


    public void setSalario(double salario) {
        this.salario = salario >=0 ? salario: 0;
    }



    
    
}
