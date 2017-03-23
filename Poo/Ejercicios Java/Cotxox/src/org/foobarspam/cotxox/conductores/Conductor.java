package org.foobarspam.cotxox.conductores;

public class Conductor {
	
	// -------------------- Propiedades --------------------
	
	public String nombre = null;
	public String modelo = null;
	public String matricula = null; //no es int porque paarecen numeros y letras
	public double valoracionMedia = 0d;
	public Conductor valoraciones[] = new Conductor[]; //array de valoraciones del conductor 
	public Boolean ocupado = false; //lo iniciamos en false significa que esta libre


	//-------------------- Constructores --------------------

	public Conductor(){
		
	}


	public Conductor(String nombre, String modelo, String matricula, double valoracionMedia, Conductor[] valoraciones,
			Boolean ocupado) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.matricula = matricula;
		this.valoracionMedia = valoracionMedia;
		this.valoraciones = valoraciones;
		this.ocupado = ocupado;
	}
		
	//-------------------------Getters & Setters---------------------------
	
	public String getNombre() {
		return this.nombre;
	}


	public String getModelo() {
		return this.modelo;
	}


	public String getMatricula() {
		return this.matricula;
	}


	public double getValoracionMedia() {
		return this.valoracionMedia;
	}


	public Conductor[] getValoraciones() {
		return this.valoraciones;
	}


	public Boolean getOcupado() {
		return this.ocupado;
	}
	
	//---------------------------Metodos------------------------------------
	
	public double setValoracion(valoracion){
		int nuevaValoracion = 0;
		for (Conductor valoraciones : getValoraciones()) {
			if (valoraciones == null) {
				nuevaValoracion++;
			}
		}
		setValoracion()[valoraciones] = Conductor;
		return nuevaValoracion;
	}
	
}


	