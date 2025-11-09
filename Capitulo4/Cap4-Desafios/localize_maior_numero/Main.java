package localize_maior_numero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> valores = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int parar = 0;
       while (parar < 10) {


        System.out.println("Digite um valor: ");
        int valor = input.nextInt();

        valores.add(valor);

        parar++;

       }
       
       System.out.println("Foram inseridos " + parar + " numeros");
       System.out.println("O maior valor digitado foi: " + LocalizarMaior.maiorValor(valores));

       LocalizarMaior.doisMaioresValores(valores);



       


        
    }

}
