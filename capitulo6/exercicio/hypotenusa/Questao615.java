package exercicio.hypotenusa;

public class Questao615 {
    
    public static double hupotenusa (double lado1, double lado2) {

        return Math.hypot(lado1, lado2);
    }


    public static void main(String[] args) {
        
        System.out.println( hupotenusa(3, 4));
        System.out.println( hupotenusa(5, 12));
        System.out.println( hupotenusa(8, 15));
    }
}
