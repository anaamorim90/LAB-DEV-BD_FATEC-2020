package entrega_introducao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrocoTest {
	
	private Troco troco = new Troco();

	@Test
	public void testSomar() {
		assertEquals(30, troco.calculaTroco(), 0);
		assertEquals(40.35, troco.calculaTroco(), 0);

		}
}

