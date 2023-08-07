package entidades;

import org.springframework.stereotype.Component;

import interfaces.IChofer;

@Component("TaxiChofer")
public class TaxiChofer implements IChofer {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Manejar un taxi";
	}

}
