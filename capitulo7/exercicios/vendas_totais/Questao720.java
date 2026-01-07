package exercicios.vendas_totais;

import java.util.Random;

public class Questao720 {

    private double[][] sales = new double[7][6];
    private Random rd = new Random();

    public Nota emitirNota() {

        return new Nota(1 + rd.nextInt(4), 1 + rd.nextInt(5), 1 + rd.nextDouble() * 2.0);

    }

    public double salvarVenda(Nota nota) {

        return sales[nota.getIdProduto()][nota.getIdVendedor()] = nota.getValorProduto();
    }

    public void somarColunas() {

        for (int j = 1; j < sales[1].length; j++) {

            double somaColunas = 0;

            for (int i = 1; i < sales.length - 1; i++) {

                somaColunas += sales[i][j];

            }

             sales[sales[j].length][j] = somaColunas;

        }

    }

    public void somarLinha() {

        double somarLinha = 0;

        for (int i = 1; i < sales.length - 1; i++) {

            for (int j = 1; j < sales[i].length - 1; j++) {

                somarLinha += sales[i][j];

            }

            // System.out.println(somarLinha);

            sales[i][sales[i].length - 1] = somarLinha;

            somarLinha = 0;

        }

        return;

    }

    

    public void relatorio() {

        for (int i = 1; i < sales.length - 1; i++) {

            System.out.printf("                        ");

            System.out.printf("%15s%s", i == sales.length - 2 ? "Total" : "Vendedor ", i == sales.length - 2 ? "" : i);

        }

        System.out.println();

        for (int i = 1; i < sales.length; i++) {

            System.out.printf("%15s%2s \t", i == sales.length - 1 ? "Total Vendedor" : "Produto",
                    i == sales.length - 1 ? "" : i);

            for (int j = 1; j < sales[i].length; j++) {

                System.out.printf("%15.2f\t\t\t\t", sales[i][j]);

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Questao720 relatorio = new Questao720();

        for (int i = 1; i <= 24; i++) {

            relatorio.salvarVenda(relatorio.emitirNota());


            relatorio.somarLinha();
            relatorio.somarColunas();

        }

        relatorio.relatorio();

        

    }
}
