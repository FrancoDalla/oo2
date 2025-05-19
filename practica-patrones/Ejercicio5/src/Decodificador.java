import java.util.ArrayList;
public class Decodificador {
	private ArrayList<Pelicula> grilla;
	private Recomendacion recomendacion;
	private ArrayList<Pelicula> vistas;
	
	
	public Decodificador(ArrayList<Pelicula> grilla) {
		this.grilla = grilla;
		vistas = new ArrayList<Pelicula>();
		this.recomendacion = new Novedad();
	}
	
	public void cambiarNovedad() {
		this.recomendacion = new Novedad();
	}
	
	public void cambiarSimilaridad() {
		this.recomendacion = new Similaridad();
	}
	
	public void cambiarPuntaje() {
		this.recomendacion = new Puntaje();
	}
	
	public ArrayList<Pelicula> recomendaciones(){
		return recomendacion.recomendar(grilla, vistas);
		
		
	}
	
}
