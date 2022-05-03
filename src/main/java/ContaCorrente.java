public class ContaCorrente {

    private double saldo;
    private double valor;
    private String titular;

    public ContaCorrente (double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar (double valor){
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Você não tem saldo suficiente para sacar!");
        }
    }

    public void depositar (double valor){
        setSaldo(getSaldo() + valor);
    }
}
