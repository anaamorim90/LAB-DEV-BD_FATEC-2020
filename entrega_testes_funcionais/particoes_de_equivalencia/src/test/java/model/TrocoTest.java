package model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class TrocoTest {

	@Test
	public void testTrocoValorPositivo() { //teste com troco correto positivo
		Troco troco = new Troco();
		double resultado = troco.calculaTroco(80.00, 75.00);
		assertEquals(5.00, resultado);
	}

	@Test
	public void testTrocoValorNegativo() { //teste com troco negativo, ou seja, faltando dinheiro para acertar o pagamento
		Troco troco = new Troco();
		double resultado = troco.calculaTroco(75.00, 80.00);
		assertEquals(-5.00, resultado);
	}
}


