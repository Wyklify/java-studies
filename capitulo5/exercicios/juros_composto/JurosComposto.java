package juros_composto;

public class JurosComposto {

    static double jurosCompostoTempo(double valorAplicado, int tempoTranscorrido) {

        return valorAplicado * Math.pow(1 + 0.05, tempoTranscorrido);
    }

    public static void main(String[] args) {

        System.out.println(String.format("%,.2f", jurosCompostoTempo(1000, 10)));

        do
        System.out.printf("%s%-20s%s %n", "Year", "Amount on deposit", "oi");
        while (true);
    }


    

}
