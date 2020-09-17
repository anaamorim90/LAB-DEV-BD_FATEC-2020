package entrega_introducao;

public class Troco implements TrocoInterface {

	@Override
	public double calculaTroco(Double conta, Double pagamento) {;
		return pagamento - conta;
	}


	
}

//feito a refatoração no código!!!