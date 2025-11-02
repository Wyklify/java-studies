
public class Conta {

    private int numeroConta;
    private int saldoInicial;
    private int novoSaldo;
    private int totalDespesas;
    private int totalCredito;
    private int limiteCreditoAutorizado;


    // já pode criar o construtor com regras para validar entradas invalidas
    public Conta(int numeroConta, int saldoInicial, int limiteCreditoAutorizado) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
        this.limiteCreditoAutorizado = limiteCreditoAutorizado;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldoInicial() {
        return saldoInicial;
    }

    public int getTotalDespesas() {
        return totalDespesas;
    }

    public int getTotalCredito() {
        return totalCredito;
    }

    public int getLimiteCreditoAutorizado() {
        return limiteCreditoAutorizado;
    }

    // não fazer setter genericos - melhor métodos que façam sentido
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoInicial(int saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void setTotalDespesas(int totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public void setTotalCredito(int totalCredito) {
        this.totalCredito = totalCredito;
    }

    public void setLimiteCreditoAutorizado(int limiteCreditoAutorizado) {
        this.limiteCreditoAutorizado = limiteCreditoAutorizado;
    }


    // não colocar métodos de mostrar no dominio do problema -- errado -- melhor mostrar em classe de exibir, no main, por exemplo.
    public void calcularNovoSaldo() {

        novoSaldo = saldoInicial + totalDespesas - totalCredito;

        System.out.println("Seu saldo é: " + novoSaldo);

        if (novoSaldo > limiteCreditoAutorizado) System.out.println("Limite de crédito excedido");

       
    }



}
