package classe_data;

enum MesNome{

        JANEIRO(1),
        FEVEREIRO(2),
        MARÇO(3),
        ABRIL(4),
        MAIO(5),
        JUNHO(6),
        JULHO(7),
        AGOSTO(8),
        SETEMBRO(9),
        OUTUBRO(10),
        NOVEMBRO(11),
        DEZEMBRO(12);

        private final int numero;

        MesNome(int numero) {
            this.numero = numero;
        }        
        
        public int getNumero() {
            return numero;
        }


        public static String mesNome(int numero) {

            for (MesNome mes : MesNome.values()) {
                
                if (mes.getNumero() == numero) {
                    
                    return mes.name();
                }
            }

            return null;
        }
}

public class Date {

    private int dia;
    private int mes;
    private int ano;


    public Date(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Date(String dia, int mes, int ano) {
        this(Integer.parseInt(dia), mes, ano);
    }

    public Date(int dia, int mes) {
        this(dia, mes, 0);
    }

    @Override
    public String toString() {
        
        return String.format("%d/%02d/%d%n", dia, mes, ano) + 
                String.format("%s %d, %d%n", MesNome.mesNome(mes), dia, ano) + 
                String.format("%d %d", dia, ano);
    }

}
