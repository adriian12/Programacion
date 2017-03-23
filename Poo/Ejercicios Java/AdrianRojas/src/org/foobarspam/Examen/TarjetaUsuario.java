package org.foobarspam.Examen;

public class TarjetaUsuario {

	// -------------------- Propiedades --------------------
	
	String id = null;
	Boolean activada = false;
	
	public TarjetaUsuario(){
		
	}
	
	// -------------------- Constructores --------------------
	
	public TarjetaUsuario(int id, Boolean activada) {
		
		this.id = id;
		this.activada = activada;
	}


	// -------------------- Getters y Setters --------------------
	

	public Boolean getActivada() {
		return this.activada;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setActivada(Boolean activada) {
		this.activada = activada;
	}
	
	
	
	
	
	
}
