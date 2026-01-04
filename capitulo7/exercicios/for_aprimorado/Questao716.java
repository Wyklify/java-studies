package exercicios.for_aprimorado;

public class Questao716 {
    
    public static void main(String[] args) {
        
        double soma = 0;

        for (String string : args) {
            
          soma +=  Double.parseDouble(string);
        }

        System.out.println("A soma é: " + soma);
    }
}
