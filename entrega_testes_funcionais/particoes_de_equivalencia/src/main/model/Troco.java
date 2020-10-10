package model;
import model.TrocoInterface;
import org.json.JSONObject;


public class Troco implements TrocoInterface {

	@Override
	public double calculaTroco(String json) {

		JSONObject val = new JSONObject(json);

		return (double) val.get("conta") - (double) val.get("pagamento");
	}


	
}

