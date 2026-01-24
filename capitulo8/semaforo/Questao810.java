package semaforo;

public class Questao810 {
    
    public static void main(String[] args) {
        
        for (TrafficLight argumentos : TrafficLight.values()) {
            
            System.out.printf("%s duracao %d%n", argumentos.toString(), argumentos.getDuracao());
        }
    }
}
