package exercicio.minimo;

public class Minimo {
    
    public static Double minimo(double a, double b, double c) {

        return Math.min(c, Math.min(a, b));
    }

    public static void main(String[] args) {
        

        System.out.println(minimo(1, 2.3, 0) );
    }
}
