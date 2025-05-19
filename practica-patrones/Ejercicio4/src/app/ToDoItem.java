package app;

import java.util.ArrayList;

public class ToDoItem {
	private String nombre;
	private Estado estado;
	ArrayList<String> comentarios;
	
	public ToDoItem(String name) {
		nombre = name;
		comentarios = new ArrayList<String>();
		estado = new Pending();
		
	}
	
	public void start() {
		estado = estado.start();
	}
	
	public void togglePause() {
		estado = estado.togglePause();
	}
	
	public void finish() {
		estado = estado.finish();
	}
	
	public int workedTime() {
		return estado.workedTime();
	}
	
	public void addComment(String comment) {
		if(estado.addComment()) {
			comentarios.add(comment);
		}
	}
}
