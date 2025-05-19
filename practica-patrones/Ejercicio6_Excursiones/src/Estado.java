
public abstract class Estado {
	public String informacion(Excursion excursion) {
		String retorno = "nombre: "+excursion.getNombre()+"costo: "+excursion.getCosto()+
				"fecha inicio:" + excursion.getInicio() + "fin: "+ excursion.getFin()+
				"punto de encuentro: "+excursion.getEncuentro();
		retorno += agregadoEstado(excursion);
		return retorno;
	}
	
	public abstract String agregadoEstado(Excursion excursion);
	
	public abstract Estado revisarEstado(Excursion excursion);
}
