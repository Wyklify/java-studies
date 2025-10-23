
import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

    private String nome;
    private String sobreNome;
    private int mes, dia, ano;


    public HeartRates(String nome, String sobreNome, int mes, int dia, int ano) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }


    public String getNome() {
        return nome;
    }


    public String getSobreNome() {
        return sobreNome;
    }


    public int getMes() {
        return mes;
    }


    public int getDia() {
        return dia;
    }


    public int getAno() {
        return ano;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }


    public void setMes(int mes) {
        this.mes = mes;
    }


    public void setDia(int dia) {
        this.dia = dia;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }
    
    double calcularIdade (int mes, int dia, int ano) {

        LocalDate hoje = LocalDate.now();

        LocalDate nascimento = LocalDate.of(ano, mes, dia);

        Period tempoTranscorrido = Period.between(nascimento,hoje ).normalized();

        double anos = tempoTranscorrido.getYears() + tempoTranscorrido.getMonths() / 12.0 + tempoTranscorrido.getDays() / 365.0;        

        return anos; 
    }
    
    double freqCardiacaMax (double idade) {
        
        return 220 - idade;

    }

    String freqCardiacaAlvo (double freqCardiacaMax) {

        double freqMinima = freqCardiacaMax * 0.50;
        double freqMaxima =  freqCardiacaMax * 0.85;

       return String.format("%.2f até %.2f %n", freqMinima, freqMaxima);
    }

    void alinharString (String nome){

        int vetor = 50;

        String [] a  = new String[vetor];

         for(int i=0; i < vetor; i++) {

           a[i] = "=";
        }

        int pos = (vetor - nome.length()) / 2;

        for (int i=0; i < nome.length() && pos + i < vetor; i++) {

            a[pos + i] = String.valueOf(nome.charAt(i));
        }

        for (String string : a) {
            
            System.out.print(string);
        }

        System.out.println();

        
    }

    void exibirInfor () {

        System.out.println();
        
        alinharString(" DADOS PESSOAIS ");       
        System.out.printf("Nome: %s %s%n",this.nome, this.sobreNome);
        System.out.printf("Nascimento: %d/%d/%d%n", this.dia, this.mes, this.ano);
        System.out.printf("Idade: %.2f %n", calcularIdade(this.mes, this.dia, this.ano));

        System.out.println();
        alinharString(" DADOS Freq CARDIACA ");
        System.out.printf("Freq Cardiaca Max recomendada: %.2f %n",freqCardiacaMax(calcularIdade(mes, dia, ano)));
        System.out.println("Freq Cardiaca Alvo: " + freqCardiacaAlvo(freqCardiacaMax(calcularIdade(mes, dia, ano))));
    }
    


}
