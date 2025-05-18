package ar.edu.unlp.info.oo2.biblioteca;

import ar.edu.unlp.info.oo2.biblioteca.Biblioteca;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
    Biblioteca biblioteca;
    
    @BeforeEach
    void setUp() throws Exception{
    	biblioteca = new Biblioteca();
    	biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
    	biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
    	biblioteca.setExporter(new SimpleJsonAdapter());
    }
    
    @Test
    public void testMostrarSocios() {
    	assertNotNull(biblioteca.exportarSocios());
    	System.out.println(biblioteca.exportarSocios());
    }
    
    @Test
    public void validarDatos() {
    	String salida = biblioteca.exportarSocios();
    	assertTrue(salida.contains("\"nombre\": \"Tyron Lannister\","),"nombre lanniser");
    	assertTrue(salida.contains("\"email\": \"tyron@thelannisters.com\","),"email lannister");
    	assertTrue(salida.contains("\"legajo\": \"2345-2\""),"legajo lannister");
    	
    	assertTrue(salida.contains("\"nombre\": \"Arya Stark\","),"nombre stark");
    	assertTrue(salida.contains("\"email\": \"needle@stark.com\","),"email stark");
    	assertTrue(salida.contains("\"legajo\": \"5234-5\""),"legajo stark");
    }
    

}
