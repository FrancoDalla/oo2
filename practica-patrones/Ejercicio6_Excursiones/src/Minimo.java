
public class Minimo extends Estado{

	public Minimo() {
		
	}
	
	@Override
	public String agregadoEstado(Excursion excursion) {
		// TODO Auto-generated method stub
		String retorno = "Faltan: " + (excursion.getCupoMaximo() - excursion.getCupoActual()) + "Para completar el maximo";
		return retorno;
	}

	@Override
	public Estado revisarEstado(Excursion excursion) {
		// TODO Auto-generated method stub
		if(excursion.getCupoActual() >= excursion.getCupoMinimo())
			return new Minimo();
		else
			return null;
	}

}
