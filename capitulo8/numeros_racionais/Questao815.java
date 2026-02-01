package numeros_racionais;

public class Questao815 {
    
    public static void main(String[] args) {
        
        Rational numero1 = new Rational(1, 6);
        Rational numero2 = new Rational(1, 12);


        System.out.println( String.format("%s + %s = %s", numero1.toString(), numero2.toString(), Rational.somar(numero1, numero2).toString()));
        System.out.println( String.format("%s - %s = %s", numero1.toString(), numero2.toString(), Rational.subtrair(numero1, numero2).toString()));
        System.out.println( String.format("%s * %s = %s", numero1.toString(), numero2.toString(), Rational.multiplicar(numero1, numero2).toString()));
        System.out.println( String.format("%s / %s = %s", numero1.toString(), numero2.toString(), Rational.dividir(numero1, numero2).toString()));

        Rational converter = new Rational(1,3);
        System.out.println( converter.toDecimalString(10));
    }
}
