package org.foobarspam.cotxox.conductores;
import org.foobarspam.cotxox.conductores.Conductor;

public class PoolConductores {
	
	// -------------------- Propiedades --------------------
	
	public PoolConductores conductores[] = new PoolConductores[conductores.Conductor];
	
	// -------------------- Constructores --------------------
			
	public PoolConductores(){
		
	}

	public PoolConductores(PoolConductores[] conductores) {
		this.conductores = conductores;
	}

	
	
	//-------------------------Getters & Setters---------------------------
	
	public PoolConductores[] getConductores() {
		return this.conductores;
	}

	//---------------------------Metodos------------------------------------
	
	
	public void asignarConductor(){
		
		//selecciona un conductor libre entre la flota y 
		//lo devuelve, estableciendo que ese conductor está ahora ocupado.
		
		
		
		
	}	
}
