package org.foobarspam.NumerosRomanosTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.foobarspam.KataNumeralesRomanos.NumerosRomanosMain;


public class TestNumRomanos {

	@Test
	public void SumatoriosTest() {
		String numeroRomano = "MDCCCLXXXVIII";
		int decimalEsperado = 1888;
		assertEquals(decimalEsperado, NumerosRomanosMain.conversor(numeroRomano));
	}

}
