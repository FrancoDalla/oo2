import java.time.LocalDate;

public class Excursion {
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String encuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private int cupoActual;
	private Estado estado;
	
	public Excursion(String nombre, LocalDate inicio, LocalDate fin, String encuentro, double costo, int cupoMinimo, int cupoMaximo) {
		cupoActual = 0;
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.cupoMaximo = cupoMaximo;
		this.cupoMinimo = cupoMinimo;
		this.costo = costo;
		this.encuentro = encuentro;
		
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public String getEncuentro() {
		return encuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public int getCupoActual() {
		return cupoActual;
	}
	
	public void revisarEstado() {
		Estado temp = estado.revisarEstado(this);
		if(temp != null)
			estado = temp;
	}
	
	public void inscribir(String usuario) {
		cupoActual +=1;
		revisarEstado();
	}
}
