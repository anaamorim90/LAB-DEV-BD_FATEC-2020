package entrega_introducao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrocoTest {
	
	private Troco troco = new Troco();

	@Test
	public void testTroco() {
		assertEquals(-40.35, troco.calculaTroco(100.00, 59.65), 0);
		assertEquals(5.00, troco.calculaTroco(75.00, 80.00), 0);
		}
}

