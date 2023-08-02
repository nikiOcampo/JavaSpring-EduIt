package entidades;

import interfaces.IVehiculos;

public class Taxi implements IVehiculos{

	@Override
	public String getCapacidad() {
		return "Un taxi tiene capacidad para 4 personas";
	}

}
