package jogo_velha;

public enum Movimento {

    X(1),
    O(-1),
    EMPTY(0);

    private final int valor; 

    Movimento(int valor) {
        
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
    
}
