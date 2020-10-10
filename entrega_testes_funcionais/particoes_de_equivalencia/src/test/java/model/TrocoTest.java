package model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.json.JSONObject;

public class TrocoTest {

	@Test
	public void testTrocoValorPositivo() { //teste com troco correto positivo
		Troco troco = new Troco();
		double resultado = troco.calculaTroco("{'conta': 80.00,'pagamento': 75.00}");
		assertEquals(5.00, resultado);
	}

	@Test
	public void testTrocoValorNegativo() { //teste com troco negativo, ou seja, faltando dinheiro para acertar o pagamento
		Troco troco = new Troco();
		double resultado = troco.calculaTroco("{'conta': 75.00,'pagamento': 80.00}");
		assertEquals(-5.00, resultado);
	}

	@Test
	public void testTrocoSemTroco() { //teste onde não haverá um troco. o valor do pagamento é igual ao da conta.
		Troco troco = new Troco();
		double resultado = troco.calculaTroco("{'conta': 80.00,'pagamento': 80.00}");
		assertEquals(0.00, resultado);
	}
}


