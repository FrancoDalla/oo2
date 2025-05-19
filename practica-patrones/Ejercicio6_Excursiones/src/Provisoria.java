
public class Provisoria extends Estado{

	@Override
	public String agregadoEstado(Excursion excursion) {
		// TODO Auto-generated method stub
		String retorno = "Faltan para cumplir el minimo" + (excursion.getCupoMinimo() - excursion.getCupoActual());
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
