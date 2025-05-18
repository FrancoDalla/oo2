
public class Pasante implements Empleado{

	private int examenes;
	
	public Pasante(int examenesP) {
		examenes = examenesP;
	}
	
	@Override
	public double basico() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double adicional() {
		// TODO Auto-generated method stub
		return 2000*examenes;
	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
