package exercicios.tartaruga_lebre;

public abstract class Animal {

    private String nome;
    private int posicaoAtual;
    private int posicaoAnterior;

    

    public Animal(String nome, int posicaoAtual, int posicaoAnterior) {
        this.nome = nome;
        this.posicaoAtual = posicaoAtual;
        this.posicaoAnterior = posicaoAnterior;
    }

    public abstract int mover(int posicao);

    public String getNome() {
        return nome;
    }

    public int getPosicaoAtual() {
        return posicaoAtual;
    }

    public int getPosicaoAnterior() {
        return posicaoAnterior;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicaoAtual(int posicaoAtual) {
        this.posicaoAtual = posicaoAtual;
    }

    public void setPosicaoAnterior(int posicaoAnterior) {
        this.posicaoAnterior = posicaoAnterior;
    }
    
    
    
}
