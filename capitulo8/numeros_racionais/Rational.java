package numeros_racionais;

public class Rational {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {

        if (denominator == 0) {

            throw new IllegalArgumentException("Quer que role divisão por zero!?");
        }

        int mdc = Mdc.mdc(numerator, denominator);

        this.numerator = numerator / mdc;
        this.denominator = denominator / mdc;

    }

    public Rational() {
        this(0, 1);
    }

    public static Rational somar(Rational um, Rational dois) {

        if (um.denominator == dois.denominator) {

            return new Rational(um.numerator + dois.numerator, um.denominator);
        }

        int mmc = Mmc.mmc(um.denominator, dois.denominator);

        int numeradorUm = um.numerator * (mmc / um.denominator);
        int numeradorDois = dois.numerator * (mmc / dois.denominator);

        return new Rational(numeradorUm + numeradorDois, mmc);
    }

    public static Rational subtrair(Rational um, Rational dois) {

        if (um.denominator == dois.denominator) {

            return new Rational(um.numerator - dois.numerator, um.denominator);
        }

        int mmc = Mmc.mmc(um.denominator, dois.denominator);

        int numeradorUm = um.numerator * (mmc / um.denominator);
        int numeradorDois = dois.numerator * (mmc / dois.denominator);

        return new Rational(numeradorUm - numeradorDois, mmc);

    }

    public static Rational multiplicar(Rational um, Rational dois) {

        return new Rational(um.numerator * dois.numerator, um.denominator * dois.denominator);

    }

    public static Rational dividir(Rational um, Rational dois) {

        return new Rational(um.numerator * dois.denominator, um.denominator * dois.numerator);

    }

    public String toDecimalString(int precisao) {
        double valor = (double) this.numerator / this.denominator;
        return String.format("%." + precisao + "f",valor);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%2d / %2d) ", this.numerator, this.denominator);
    }

}
