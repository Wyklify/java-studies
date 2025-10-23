public class InvoiceTest {
        public static void main(String[] args) {
                // Caso 1: valores válidos
                Invoice inv1 = new Invoice("001", "Mouse óptico", 3, 25.50);
                System.out.printf("Fatura 1 (%s - %s): qtd=%d, preço=%.2f, total=%.2f%n",
                                inv1.getNumero(), inv1.getDescricao(), inv1.getQuantidade(), inv1.getPreco(),
                                inv1.getInvoiceAmount());

                // Caso 2: quantidade e preço não positivos (devem virar 0)
                Invoice inv2 = new Invoice("002", "Teclado mecânico", -5, -10.00);
                System.out.printf("Fatura 2 (%s - %s): qtd=%d, preço=%.2f, total=%.2f%n",
                                inv2.getNumero(), inv2.getDescricao(), inv2.getQuantidade(), inv2.getPreco(),
                                inv2.getInvoiceAmount());

                // Caso 3: ajustando via setters com valores não positivos
                inv1.setQuantidade(0); // vira 0
                inv1.setPreco(0.0); // vira 0.0
                System.out.printf("Fatura 1 após setters: qtd=%d, preço=%.2f, total=%.2f%n",
                                inv1.getQuantidade(), inv1.getPreco(), inv1.getInvoiceAmount());

                // Caso 4: atualizando para valores válidos
                inv1.setQuantidade(4);
                inv1.setPreco(99.90);
                System.out.printf("Fatura 1 atualizada: qtd=%d, preço=%.2f, total=%.2f%n",
                                inv1.getQuantidade(), inv1.getPreco(), inv1.getInvoiceAmount());
        }
}