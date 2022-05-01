public class ContaCorrente {

    private String nome;
    private int conta, saques;
    private double saldo;

    public ContaCorrente (String nome, int conta, int saques, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saques = saques;
        this.saldo = saldo;
    }

    public void sacar (double valor){
        saldo = saldo - valor;
    }

    public void depositar (double valor){
        saldo = saldo + valor;
    }


}
