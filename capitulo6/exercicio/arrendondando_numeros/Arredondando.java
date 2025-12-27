package exercicio.arrendondando_numeros;

public class Arredondando {


    public static String arredondaFloor(double valor){



        return String.format("%.2f - %.2f",valor, Math.floor((valor * 10 + 0.5) / 10 ));
    }


    public static void main(String[] args) {
        
        

        System.out.println( arredondaFloor(11.9999987814758) );
    }
    
}
