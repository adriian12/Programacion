package org.foobarspam.cotxox.carrera;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	
	// -------------------- Propiedades --------------------
	
	public int tiempoEsperado = 0; //En minutos
	public int tiempoCarrera = 0; //En minutos
	public double costeTotal = 5;
	public String conductor = null;
	
	
	// -------------------- Constructores --------------------
	
	public Carrera(){
		
	}

	public Carrera(int tiempoEsperado, int tiempoCarrera, double costeTotal, String conductor) {
		
		this.tiempoEsperado = tiempoEsperado;
		this.tiempoCarrera = tiempoCarrera;
		this.costeTotal = costeTotal;
		this.conductor = conductor;
	}

	
	//-------------------------Getters & Setters---------------------------
	
	public int getTiempoEsperado() {
		return this.tiempoEsperado;
	}

	public int getTiempoCarrera() {
		return this.tiempoCarrera;
	}

	public double getCosteTotal() {
		return this.costeTotal;
	}

	public String getConductor() {
		return this.conductor;
	}
	
	
	//---------------------------Metodos------------------------------------
	
	public String getTarjetaCredito(){
		/*
		 * devuelve el número de la tarjeta de crédito del usuario/a
		 */
		
		return this.getTarjetaCredito();
	}
	
	public String getOrigen(){
		/*
		 * devuelve el lugar de origen del trayecto
		 */
		
		return this.getOrigen();
	}
	
	public String getDestino(){
		
		//devuelve el lugar de destino del trayecto
		 
		return this.getDestino();
	}
	
	public double getDistancia(){
		
		//devuelve la distancia entre el origen y el destino en km
		
		return this.getDistancia();
	}
	
	public double getCosteEsperado(){
		
		//devuelve el coste esperado del trayecto, cuyo cálculo es responsabilidad de la clase Tarifa
		
		return Tarifa.getCosteTotalEsperado(carrera);
	}
	
	public String asignarConductor(PoolConductores[] conductores){
		
	}
	
}
