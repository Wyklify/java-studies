package exercicio.qualitypoints;

public class Questao628 {

    public static int qualityPoints(int media) {

        return switch(media/10) {
            case 10,9 -> 4;
            case 8 -> 3;
            case 7 -> 2;
            case 6 -> 1;
            default -> 0;
        };
    }


    public static void main(String[] args) {
        
        System.out.println( qualityPoints(95));
    }
}
