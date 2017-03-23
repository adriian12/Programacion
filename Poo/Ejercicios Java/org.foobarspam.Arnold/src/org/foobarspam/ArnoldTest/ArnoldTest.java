package org.foobarspam.ArnoldTest;

import static org.junit.Assert.*;

import org.foobarspam.Arnold.Planeta;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ArnoldTest {
	
	public static String[] planetas;
	
	@BeforeClass
	public static void CreacionArrayPlanetasSetup(){
		planetas = new String[8];
		int planetasIncluidos = 0;
		for(Planeta planeta : Planeta.values()){
			planetas[planeta.ordinal()] = planeta.name();
			planetasIncluidos += 1;
		}
		assertThat(planetasIncluidos).isEqualTo(Planeta.values().length);
	}
	

	@Test
	public void PlanetaConstructorTest() {
		// voy a asegurarme de que los metodos de los Enum Types
		// se comportan como yo espero
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta).isInstanceOf(Planeta.class);
		assertThat(planeta.ordinal()).isEqualTo(0);
		assertThat(planeta.name()).isEqualToIgnoringWhitespace("MERCURY");
		assertThat(Planeta.valueOf(planeta.name())).isEqualTo(Planeta.MERCURY);
		assertThat(planeta.compareTo(planeta.MERCURY)).isEqualTo(0);
		assertThat(planeta.toString()).isEqualToIgnoringWhitespace("MERCURY");
		assertThat(planeta.equals(planeta.MERCURY)).isEqualTo(true);
		assertThat(Planeta.values()[0]).isEqualTo(planeta);
	}


	@Test
	public void PlanetaGetMasaTest(){		
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta.getMasa()).isEqualTo(3.303e+23);
	}
	
	@Test
	public void PlanetaGetRadioTest(){		
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta.getRadio()).isEqualTo(2.4397e+6);
	}
	
	@Test
	public void PlanetaNamesIteratorTest(){
		for(Planeta planeta : Planeta.values()){
			assertThat(planeta.name()).isIn(planetas);
		}
	}
	
	@Test
	public void PesoSuperficieMercurioTest(){
		Planeta planeta = Planeta.MERCURY;
		double pesoHumano = 175;
		assertEquals(66.107583, planeta.MERCURY.pesoSuperficie(pesoHumano) , 0.001);
	}
	
}









