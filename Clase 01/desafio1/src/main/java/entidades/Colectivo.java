package entidades;

import interfaces.CreacionLicencias;
import interfaces.IVehiculos;

public class Colectivo implements IVehiculos {
	
	private CreacionLicencias cl;
	
	public Colectivo(CreacionLicencias cl) {
		this.cl = cl;
	}

	@Override
	public String getCapacidad() {
		return "Un Colectivo tiene capacidad para 30 personas";
	}

	@Override
	public String getLicencia() {
		// TODO Auto-generated method stub
		return "De tipo B Colectivo - " + cl.getLicencia();
	}

}
