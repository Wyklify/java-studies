package exercicios.vendas_totais;

public class Nota {
    
    private int idVendedor;
    private int idProduto;
    private double valorProduto;

    
    public Nota(int idVendedor, int idProduto, double valorProduto) {
        this.idVendedor = idVendedor;
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
    }


    public int getIdVendedor() {
        return idVendedor;
    }


    public int getIdProduto() {
        return idProduto;
    }


    public double getValorProduto() {
        return valorProduto;
    }

    
}
