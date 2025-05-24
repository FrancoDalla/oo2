import java.util.ArrayList;

public class Composite extends Topografia{
	private ArrayList<Topografia> compuesto;
	
	public Composite() {
		super();
	}
	
	
	public void agregar(Topografia topografia) {
		compuesto.add(topografia);
	}
	
	public void eliminar(Topografia topografia) {
		compuesto.remove(topografia);
	}
	
	@Override
	public double proporcionAgua() {
		return (compuesto.stream()
				.mapToDouble(compuesto -> compuesto.getValor()).sum()) / 4 ;
	}

}
