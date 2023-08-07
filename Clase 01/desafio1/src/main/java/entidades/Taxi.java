package entidades;

import interfaces.CreacionLicencias;
import interfaces.IVehiculos;

public class Taxi implements IVehiculos{
	
	private CreacionLicencias cl;
	
	public Taxi(CreacionLicencias cl) {
		this.cl = cl;
	}

	@Override
	public String getCapacidad() {
		return "Un taxi tiene capacidad para 4 personas";
	}

	@Override
	public String getLicencia() {
		// TODO Auto-generated method stub
		return "De tipo A -Taxi " + cl.getLicencia();
	}

}
