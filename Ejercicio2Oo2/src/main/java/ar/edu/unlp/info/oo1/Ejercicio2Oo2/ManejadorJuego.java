package ar.edu.unlp.info.oo1.Ejercicio2Oo2;

public class ManejadorJuego {
	/* 0 -> piedra
	 * 1 -> papel
	 * 2 -> tijera
	 * 3 -> lagarto
	 * 4 -> spock
	 */
	private String resultados[][] = {{"empate", "papel", "piedra","piedra","spock"},
							{"papel", "empate", "tijera","lagarto","papel"},
							{"piedra", "tijera", "empate","tijera","spock"},
							{"piedra", "lagarto","tijera","empate","lagarto"},
							{"spock","papel","spock","lagarto","empate"}};
	
	
	public ManejadorJuego() {
		
	}
	
	public String partida(Mano mano1, Mano mano2) {
		return resultados[mano1.getValor()][mano2.getValor()];
	}
	
}
