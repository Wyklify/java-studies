package numeros_complexos;

public class Questao811 {

    public static void main(String[] args) {

        Complex um = new Complex(1, 2);
        
        System.out.println( um.somar(um, um));
        System.out.println( um.subtrair(um, um));
        System.out.println( um );
    }

}
