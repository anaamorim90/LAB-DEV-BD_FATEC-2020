package model;
import model.TrocoInterface;


public class Troco implements TrocoInterface {

	@Override
	public double calculaTroco(double conta, double pagamento) {
		return conta - pagamento;
	}


	
}

