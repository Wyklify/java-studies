package exercicio.distancia_entre_pontos;

public class Questao632 {

    public static double distance(double x1, double y1, double x2, double y2){


        return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }


    public static void main(String[] args) {
        
        System.out.println( distance(2, 3, 7, 11));
    }
    
}
