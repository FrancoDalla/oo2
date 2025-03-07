package ar.edu.unlp.info.oo1.Ejercicio1Oo2;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public boolean agregarUsuario(Usuario usuario) {
		if(!usuarios.stream().anyMatch(usuarioActual -> usuarioActual.corresponde(usuario.getScreenName()))) {
			usuarios.add(usuario);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void eliminarUsuario(String screenName) {
		Usuario erasedUser = usuarios.stream().filter(usuarioActual -> usuarioActual.corresponde(screenName))
				.findFirst().orElse(null);
		if(erasedUser != null) {
			erasedUser.eliminar();
			usuarios.remove(erasedUser);
		}
	}
	
	public int registrados() {
		return usuarios.size();
	}
	
}
