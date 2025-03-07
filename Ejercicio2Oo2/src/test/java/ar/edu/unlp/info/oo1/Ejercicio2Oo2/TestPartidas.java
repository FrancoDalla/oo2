package ar.edu.unlp.info.oo1.Ejercicio2Oo2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPartidas {
	Piedra piedra;
	Tijera tijera;
	Papel papel;
	ManejadorJuego manejador;
	@BeforeEach
	void setUp() {
		piedra = new Piedra();
		tijera = new Tijera();
		papel = new Papel();
		manejador = new ManejadorJuego();
	}
	
	@Test
	public void papelVsTijera() {
		assertEquals("tijera",manejador.partida(tijera, papel));
	}
	
	@Test 
	public void tijeraVsTijera() {
		assertEquals("empate",manejador.partida(tijera, tijera));
	}
	
	@Test
	public void tijeraVsPiedra() {
		assertEquals("piedra",manejador.partida(piedra, tijera));
	}
}	
