import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Puntaje implements Recomendacion{

	@Override
	public ArrayList<Pelicula> recomendar(ArrayList<Pelicula> peliculas, ArrayList<Pelicula> peliculasVistas) {
		ArrayList<Pelicula> recomendaciones = new ArrayList<Pelicula>(peliculas);
		recomendaciones.removeAll(peliculasVistas);
		return new ArrayList<Pelicula>(recomendaciones.stream()
				.sorted(Comparator.comparing(Pelicula::getPuntaje)
						.thenComparing(Pelicula::getEstreno))
				.limit(3)
				.collect(Collectors.toList()));
	}
	
	
	

}
