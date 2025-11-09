package localize_maior_numero;

import java.util.List;

public class LocalizarMaior {

    static public int maiorValor(List<Integer> valor) {

        int maiorValor = 0;

        for (int i : valor) {

            if (i > maiorValor) {

                maiorValor = i;
            }

        }

        return maiorValor;
    }

    static public void doisMaioresValores(List<Integer> valor) {

        int maiorValor = 0;
        int segundoMaiorValor = 0;

        for (int i : valor) {

            if (maiorValor == 0) {

                maiorValor = i;
                

            } else if (i > maiorValor) {

                segundoMaiorValor = maiorValor;
                maiorValor = i;

            }

        }

        System.out.println("O maior valor eh: " + maiorValor);
        System.out.println("O segundo maior valor eh: " + segundoMaiorValor);

    }

}
