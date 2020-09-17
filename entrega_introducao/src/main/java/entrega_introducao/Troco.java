package entrega_introducao;

public class Troco implements TrocoInterface {

	@Override
	public double calculaTroco(Double conta, Double pagamento) {
		Double troco = pagamento - conta;
		return troco;
	}


	
}

