package org.foobarspam.TestCarrera;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera;
import org.junit.Test;

public class TestCarrera {

	@Test
	public void testCarrera() {
		tarjetaCredito = new TarjetaCredito("4916119711304546");
		origen = new origen("Aeroport Son Sant Joan");
		destino = new Destino("Magaluf");
		distancia = new Distancia(7.75); //En kilometros
		tiempoEsperado = new TiempoEsperado(10);
	}

}
