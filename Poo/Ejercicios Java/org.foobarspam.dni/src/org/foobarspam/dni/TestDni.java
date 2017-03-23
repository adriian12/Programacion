package org.foobarspam.dni;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDni {

	@Test
	public void testDniCorrecto() {
		String dniCorrecto = "43200537X";
		
		assertTrue(Validador.leer(dniCorrecto));
	}

	@Test
	public void testDniIncorrecto(){
		String dniIncorrecto = "12345678U";
		
		assertFalse(Validador.leer(dniIncorrecto));
	}
	
	@Test
	public void testNieCorrecto(){
		String nieCorrecto = "X1234567X";
		
		assertTrue(Validador.leer(nieCorrecto));
	}
	
	@Test
	public void testNieIncorrecto(){
		String nieIncorrecto = "A123456A";
		
		assertFalse(Validador.leer(nieIncorrecto));
	}
}
