import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {

    @Test
    public void testeDepositar() {
        ContaCorrente conta = new ContaCorrente(100, "Guilherme");
        double resultadoEsperado = 150;
        conta.depositar(50);
        Assertions.assertEquals(resultadoEsperado, conta.getSaldo());
        System.out.println("TESTE DEPOSITAR: Seu saldo atual é de: " + conta.getSaldo());
    }

    @Test
    public void testeSacar(){
        ContaCorrente conta = new ContaCorrente(100, "Guilherme");
        double resultadoEsperado = 50;
        conta.sacar(50);
        Assertions.assertEquals(resultadoEsperado, conta.getSaldo());
        System.out.println("TESTE SACAR: Seu saldo atual é de: " + conta.getSaldo());
    }

    @Test
    public void testeSacarZero(){
        ContaCorrente conta = new ContaCorrente(0,"Guilherme");
        double resultadoEsperado = 0;
        conta.sacar(60);
        Assertions.assertEquals(resultadoEsperado, conta.getSaldo());
        System.out.println("TESTE SACAR ZERO: Seu saldo atual é de: " + conta.getSaldo());
    }
}
