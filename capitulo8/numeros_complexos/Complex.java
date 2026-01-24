package numeros_complexos;

public class Complex {

    
    private double parteReal;
    private double parteImaginaria;


    public Complex( double parteReal, double parteImaginaria) {
        
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complex(){

        this(0,0);
    }    
    
    public Complex somar(Complex um, Complex dois) {

        return new Complex(um.parteReal + dois.parteReal, um.parteImaginaria + dois.parteImaginaria);
    }
    
    public Complex subtrair(Complex um, Complex dois) {

        return new Complex(um.parteReal - dois.parteReal , um.parteImaginaria - dois.parteImaginaria);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%.2f,%.2f%n",parteReal,parteImaginaria);
    }

}
