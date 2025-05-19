import java.util.ArrayList;
import java.time.LocalDate;

public class Pelicula {
	private String titulo;
	private LocalDate estreno;
	private ArrayList<Pelicula> similares;
	private int puntaje;
	
	public Pelicula(String titulo, LocalDate estreno, ArrayList<Pelicula> similares, int puntaje) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.similares = similares;
		this.puntaje = puntaje;
	}

	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getEstreno() {
		return estreno;
	}

	public void setEstreno(LocalDate estreno) {
		this.estreno = estreno;
	}

	public ArrayList<Pelicula> getSimilares() {
		return similares;
	}

	public void setSimilares(ArrayList<Pelicula> similares) {
		this.similares = similares;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	
	public boolean similar(Pelicula pelicula) {
		return similares.contains(pelicula);
	}
	
	
	
}
