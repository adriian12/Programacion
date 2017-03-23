package org.foobarspam.Arnold;

public enum Planeta {
	
	MERCURY(3.303e+23, 2.4397e+6),
	EARTH(5.976e+24, 6.37814e6);
	private double masa;
	private double radio;
	private double gravedad = 6.67300E-11;
	
	private Planeta(double masa, double radio) {
		this.masa = masa;
		this.radio = radio;
	}
	
		
	public double getMasa() {
		return masa;
	}


	public double getRadio() {
		return radio;
	}

	public double pesoSuperficie(double pesoHumano) {
		return tuMasa(pesoHumano) * gravedadSuperficie();
	}
	
	private double gravedadSuperficie() {
		return gravedad * masa / radio*2;
	} 
	
	public double tuMasa(double pesoHumano){
		return pesoHumano / EARTH.gravedadSuperficie();
	}
}
