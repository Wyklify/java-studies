package juros_composto;

public class JurosComposto {

    static double jurosCompostoTempo(double valorAplicado, int tempoTranscorrido, double porcentagem) {

        return valorAplicado * Math.pow(1 + porcentagem, tempoTranscorrido);
    }

    public static void main(String[] args) {

        int tempoTrancorrido = 10;
        

        for (int i = 1; i <= tempoTrancorrido; i++) {


            System.out.print( i + " \t");

            for (int j = 5; j <= 10; j++) {
                  
                double porcentagem = j / 100.0;

               System.out.print(String.format("%,.2f" + "\t", jurosCompostoTempo(1000, i, porcentagem)));
            }

            System.out.println();
        }

        
    }

}
