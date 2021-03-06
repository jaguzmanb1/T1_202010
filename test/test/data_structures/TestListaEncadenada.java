package test.data_structures;

import model.data_structures.ListaEncadenada;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestListaEncadenada {

	private ListaEncadenada<Integer> arreglo;
	private static int TAMANO=100;
	
	@Before
	public void setUp1() {
		arreglo= new ListaEncadenada<Integer>();
	}

	public void setUp2() {
		for(int i =0; i< TAMANO; i++){
			arreglo.insertarAlFinal(i);
		}
	}

	@Test
	public void testArregloDinamico() {
		// TODO
		setUp1();
		assertTrue(arreglo != null);
		assertEquals(0, arreglo.darLongitud());
	}

	@Test
	public void testBuscarElemento() {
		setUp2();
		assertEquals((Integer)100, arreglo.buscar(100));
		// TODO
	}

}
