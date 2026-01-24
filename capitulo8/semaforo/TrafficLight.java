package semaforo;

public enum TrafficLight {
    RED(10),
    GREEN(15),
    YELLOW(5);

    private final int duracao;

    TrafficLight(int duracao){

        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    
}
