import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
public class Similaridad implements Recomendacion{

	@Override
	public ArrayList<Pelicula> recomendar(ArrayList<Pelicula> peliculas, ArrayList<Pelicula> peliculasVistas){
		return new ArrayList<Pelicula>(
				peliculas.stream()
				.filter(pelicula -> peliculasVistas.get(0).similar(pelicula))
				.sorted(Comparator.comparing(Pelicula::getEstreno))
				.limit(3)
				.collect(Collectors.toList())
				);
				
				
	}

}
