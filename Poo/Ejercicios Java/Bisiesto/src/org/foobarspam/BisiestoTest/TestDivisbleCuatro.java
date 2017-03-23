package org.foobarspam.BisiestoTest;

import static org.junit.Assert.*;

import org.foobarspam.BisiestoYear.Year;
import org.junit.Test;


public class YearTesting {s

	@Test
	public void testLeapYearO() {
		Year year = new Year(2000);
		assertTrue(year.isLeap());
	}
	@Test
	public void testLeapYearHndred() {
		Year year = new Year(2100);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearTwoHundred() {
		Year year = new Year(2200);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearThreeHundred() {
		Year year = new Year(2300);
		assertFalse(year.isLeap());
	}
	@Test
	public void testLeapYearFour() {
		Year year = new Year(2400);
		assertTrue(year.isLeap());
	}
}


//Has hecho algun diseño antes de programar?
		
//En que momento te diste cuenta que no podias hacer un 'loop' y calcular los puntos?
		
//Cuando termines lee el codigo y mira si se parece a uno partida de bolos de verdad.

//Has hecho suficiente refactorizacion?
		
//Como has decidio los test que escribir y el orden?
		
		