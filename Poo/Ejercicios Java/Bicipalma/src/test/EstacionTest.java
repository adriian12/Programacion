package org.foobarspam.ooyfm.test;

import static org.junit.Assert.*;

import org.foobarspam.ooyfm.estacion.Estacion;
import org.junit.Test;



public class EstacionTest {

	@Test
	public void ConstructorEstacionTest() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		int delta = 0;
		
		assertEquals(1, estacion.getId(), delta);
		assertEquals("Manacor", estacion.getDireccion());
		assertEquals(6, estacion.getNumeroAnclaje(), delta);
	}

}
