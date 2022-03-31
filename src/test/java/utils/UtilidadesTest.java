package test.java.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.utils.Utilidades;

public class UtilidadesTest extends Utilidades {

	@Test
	void testInvertirListaImpar() {
		Integer[] listaEnteros = new Integer[3];
		listaEnteros[0] = 1;
		listaEnteros[1] = 3;
		listaEnteros[2] = 5;
		
		Integer[]invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida[0], 5);
		assertEquals(invertida[1], 3);
		assertEquals(invertida[2], 1);
		
	}
	
	@Test
	void testInvertirListaPar() {
		Integer[] listaEnteros = new Integer[4];
		listaEnteros[0] = 1;
		listaEnteros[1] = 3;
		listaEnteros[2] = 5;
		listaEnteros[3] = 30;

		
		Integer[]invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida[0], 30);
		assertEquals(invertida[1], 5);
		assertEquals(invertida[2], 3);
		assertEquals(invertida[3], 1);
		
	}
	
	@Test
	void testInvertirListaVacia() {
		Integer[] listaEnteros = new Integer[0];

		Integer[]invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida.length, 0);
		
	}
	
	@Test
	void testInvertirListaNula() {
		Integer[] listaEnteros = null;

		Integer[]invertida = Utilidades.reverse(listaEnteros);
		
		assertEquals(invertida, null);
		
	}
	
	@Test
	void testICadenaNoVacia() {
		String[] saludo = "Hola que tal".split(" ");
		
		assertEquals(Utilidades.reverse(saludo)[0], "tal");
		assertEquals(Utilidades.reverse(saludo)[1], "que");
		assertEquals(Utilidades.reverse(saludo)[2], "Hola");
		
	}
	
	@Test
	void testEsCapicua() {
		assertTrue(new Utilidades().esCapicua("ana"));
		assertTrue(new Utilidades().esCapicua(21.12));
		assertTrue(new Utilidades().esCapicua(2112));

		
	}
	
	@Test
	void testNoEsCapicua() {
		assertFalse(new Utilidades().esCapicua("casa"));
		assertFalse(new Utilidades().esCapicua(21.22));
		assertFalse(new Utilidades().esCapicua(2132));

		
	}
	
	
	
}
