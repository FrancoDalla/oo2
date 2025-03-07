package ar.edu.unlp.info.oo1.Ejercicio1Oo2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Usuario karl, carlos;
	Twitter twitter;
	@BeforeEach
	void setUp() throws Exception{
		karl = new Usuario("Karl Marx");
		carlos = new Usuario("Carlos Beltran"); 
		twitter = new Twitter();
	}
	
	@Test
	public void testAgregarPublicacion() {
		SimpleTweet tweetSimple = new SimpleTweet("Ultra woke la nueva pelicula de antman");
		ReTweet reTweet = new ReTweet(tweetSimple);
		karl.agregarTweet(tweetSimple);
		carlos.agregarTweet(reTweet);
		assertEquals(tweetSimple.mostrarContenido(),reTweet.mostrarContenido());
	}
	
	@Test
	public void agregarUsuario() {
		Usuario copion = new Usuario("Karl Marx");
		assertTrue(twitter.agregarUsuario(carlos));
		assertTrue(twitter.agregarUsuario(karl));
		assertFalse(twitter.agregarUsuario(copion));
	}
	
	@Test 
	public void eliminarUsuario() {
		twitter.eliminarUsuario("Karl Marx");
		twitter.eliminarUsuario("Carlos Beltran");
		assertEquals(0,twitter.registrados());
		assertEquals(0,karl.publicaciones());
		assertEquals(0,carlos.publicaciones());
	}
	
}
