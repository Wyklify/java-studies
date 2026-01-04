package exercicios.argumentos_linha_comando;

public class Questao715 {
    
    public static void main(String[] args) {
        
        int[] array = new int[ args.length == 0 ? 10 : Integer.parseInt(args[0]) ]; 

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
