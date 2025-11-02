
 /* Ler varias entradas de km dirigidos (int)
         * Ler entrada da quantidade de gasolina consumida (int)
         * Calcular consumo km/litros
         * exibir o consumo
         * imprimir a quilometragem total
         * imprimir soma total de litros de combustível consumidos 
         */
    
         // resolvi usar singleton aqui!

public class CalcularCombustivel {

   // private int gasolina;
   // private int km;

    private int kmTotal;
    private int gasolinaTotal;

    private static CalcularCombustivel instancia;

    private CalcularCombustivel() {
        this.gasolinaTotal = 0;
        this.kmTotal = 0;
    }

    public static CalcularCombustivel getInstancia() {

        if (instancia == null) {
            instancia = new CalcularCombustivel();
        }

        return instancia;
    }

    public double calcularConsumo ( int gasolina, int km) {

        

        this.kmTotal += km;
        this.gasolinaTotal += gasolina;
              
        
        return (double) km/ gasolina;

    }  

    

    public int getKmTotal() {
        return kmTotal;
    }

    public int getGasolinaTotal() {
        return gasolinaTotal;
    }

   



 

}
