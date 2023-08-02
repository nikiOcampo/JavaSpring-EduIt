package entidades;

import interfaces.IVehiculos;

public class Colectivo implements IVehiculos {

	@Override
	public String getCapacidad() {
		return "Un Colectivo tiene capacidad para 30 personas";
	}

}
