package exercicios.crivo_eratostenes;

public class Questao727 {

    public static void main(String[] args) {
        boolean[] primitivo = new boolean[1000];

        for (int i = 0; i < primitivo.length; i++) {
           
            primitivo[i] = true;
        }


        for (int i = 2; i * i< primitivo.length; i++) {

            for (int j = i * 2; j < primitivo.length; j+= i) {
                
                    primitivo[j] = false;
            }

        }


        for (int i = 2; i < primitivo.length; i++) {
            
            if (primitivo[i] == true) {
                
                System.out.println("eh primo: " + i);
            }
        }

    }
}
