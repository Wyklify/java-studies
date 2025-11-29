package crescimento_demografico;


public class CrescimentoDemografico {

    // considerando a taxa de crescimento anual de 0,83% ao ano
    // população atual cerca de 8,2 bilhões

    static void mostrarTabelaDemografica() {

        double populacaoAtual = 8.2e9;
        
        boolean dobrou = false;

        int ano = 0;
        


        for (int i = 1; i <= 75; i++) {

            double populacaoAnterior = populacaoAtual;

            populacaoAtual = populacaoAtual * 1.0083;

            double crescimentoAnual = populacaoAtual - populacaoAnterior;

            if ( populacaoAtual >=  2 * 8.2e9 && dobrou == false) {

                ano = i;
                dobrou = true;
                
            }


            
            System.out.println(i + "    " + populacaoAtual  + "     " + crescimentoAnual );

            
        }


        if ( ano == 0) {

            System.out.println( "Não dobrou em 75 anos");
            
        } else {  System.out.println("Vai dobrar em : "  + ano); }

       
    }
    


    public static void main(String[] args) {
        
        CrescimentoDemografico.mostrarTabelaDemografica();
        
    }
}
