package exercicios.jogo_dados;

public class Dado {

    private int lado;    

    public void setLado(int lado) {
        this.lado = lado > 1 || lado < 6 ? lado : -1;
    }

    public int getLado() {
        return lado;
    }

    @Override
    public String toString() {
        
        return "Valor: " + lado;
    }
}
