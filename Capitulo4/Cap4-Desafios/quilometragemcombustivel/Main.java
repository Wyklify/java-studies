import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Ler varias entradas de km dirigidos (int)
         * Ler entrada da quantidade de gasolina consumida (int)
         * Calcular consumo km/litros
         * exibir o consumo
         * imprimir a quilometragem total
         * imprimir soma total de litros de combustível consumidos
         */

        Scanner input = new Scanner(System.in);

        boolean flag = false;

       

        while (!flag) {            
        



        System.out.print("Digite a quantidade gasolina consumida: ");
        int gasolina = input.nextInt();

        if (gasolina <= 0) {

            System.out.println(" A gasolina precisa ser positiva");
            continue;
        }

        input.nextLine();

        System.out.print("Digite a quantidade de km do percurso: ");
        int km = input.nextInt();

        if (km < 0 ) {

            System.out.println( " A kilometragem precisa ser >= 0");
            continue;
        }


        
         CalcularCombustivel viagem1 = CalcularCombustivel.getInstancia();


        System.out.println("O consumo da viagem foi: " + viagem1.calcularConsumo(gasolina,km) + "Km/L");
        System.out.println("O km total percorrido foi: " + viagem1.getKmTotal() + "Km");
        System.out.println("A gasolina  total consumida foi: " + viagem1.getGasolinaTotal() + "L" );


        System.out.println("Deseja adicionar uma nova viagem? S/N ");

       String c = input.next();

       flag = (c.equals("S") ) ? false : true;
        

        }

    }

}
