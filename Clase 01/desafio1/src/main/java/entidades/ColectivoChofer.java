package entidades;

import org.springframework.stereotype.Component;

import interfaces.IChofer;

@Component("ColectivoChofer")
public class ColectivoChofer implements IChofer{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Manejar un colectivo";
	}

}
