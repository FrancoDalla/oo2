import java.util.ArrayList;

public class FileSystem {
	private ArrayList<Componente> componentes;
	
	public FileSystem() {
		componentes = new ArrayList<Componente>();
	}

	public int tamanoTotalOcupado() {
		return componentes.stream()
				.mapToInt(componente -> componente.getSize()).sum();
	}
	
	public Componente archivoMasGrande() {
		return componentes.stream()
				.max((componenteA, componenteB) -> Integer.compare(componenteA.getSize(), componenteB.getSize())).orElse(null);
	}
	
	public Componente archivoMasNuevo() {
		return componentes.stream().min((componenteA, componenteB) -> Date.compare(componenteA.getCreacion(), componenteB.getCreacion()));
	}
	
	
	public ArrayList<Componente> buscar(String nombre){
	}
	
	
}
