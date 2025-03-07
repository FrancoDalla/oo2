package ar.edu.unlp.info.oo1.Ejercicio1Oo2;

public class SimpleTweet extends Tweet{
	private String contenido;
	
	public SimpleTweet(String contenido) {
		super();
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	@Override
	public String mostrarContenido() {
		return getContenido();
	}
	
	
}
