package app;
import java.util.ArrayList;

public abstract class Estado {
	protected int tiempo;
	protected String nombre;
	
	public Estado() {
		tiempo = 0;
		
	}
	
	public Estado(int tiempo, String nombre) {
		this.tiempo = tiempo;
		this.nombre = nombre;
	}
	
	public abstract Estado start();
	public abstract Estado togglePause();
	
	
	public abstract Estado finish();
	
	public int workedTime() {
		return tiempo;
	}
	
	public abstract boolean addComment();
	
}
