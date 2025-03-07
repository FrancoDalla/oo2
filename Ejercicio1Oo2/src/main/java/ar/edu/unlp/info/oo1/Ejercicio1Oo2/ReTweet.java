package ar.edu.unlp.info.oo1.Ejercicio1Oo2;

public class ReTweet extends Tweet{
	private SimpleTweet referencia;
	
	public ReTweet(SimpleTweet referencia) {
		super();
		this.referencia = referencia;
	}

	@Override
	public String mostrarContenido() {
		return referencia.getContenido();
	}
	
	
}
