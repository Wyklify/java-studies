

public class Invoice {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;



    public Invoice(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade =  (quantidade >= 0 ) ? quantidade : 0;
        this.preco = (preco >= 0) ? preco: 0;
    }



    public String getNumero() {
        return numero;
    }



    public String getDescricao() {
        return descricao;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public double getPreco() {
        return preco;
    }



    public void setNumero(String numero) {
        this.numero = numero;
    }



    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade >= 0 ? quantidade : 0;
    }



    public void setPreco(double preco) {
        this.preco = preco >= 0 ? preco: 0;
    }
    
    double getInvoiceAmount () {
        
        return this.quantidade * this.preco;
    }
}
