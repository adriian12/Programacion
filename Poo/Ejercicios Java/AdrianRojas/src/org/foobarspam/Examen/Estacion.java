package org.foobarspam.Examen;

import java.util.Arrays;

import org.foobarspam.Examen.Bicicleta;

public class Estacion {
	// -------------------- Propiedades --------------------
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = new Bicicleta[numeroAnclajes];
	
	// -------------------- Constructores --------------------
	public Estacion() {
		
	}
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
		
	}
	
	// -------------------- Getters y Setters --------------------

	public int getId() {
		return this.id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}

	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}
	
	
	// -------------------- METODOS --------------------
	
	public void consultarEstacion() {
		
		 // Metodo que muestra un mensaje con id, direccion y numeroAnclajes
		
		System.out.println("Id: " + getId());
		System.out.println("Direccion: " + getDireccion());
		System.out.println("Numero anclajes: " + getNumeroAnclajes());
	}
	
	
	public int anclajesLibres(){
		
		//Metodo que recorre el array Anclajes y devuelve la cantidad de huecos disponibles
		int libres = 0;
		for (Bicicleta bicicleta : getAnclajes()){
			if(bicicleta == null)
				libres ++;
			
		}
		return libres;
	}

	
	public void consultarAnclajes(){
		
		//Metodo que recorre el array Anclajes e imprime las bicicletas que se encuentran en el
		
		for (int total = 0; total < anclajes.length; total ++){
			if(anclajes[total] != null){
				System.out.println("En el anclaje numero" + (total + 1) + "se encuentra la bicicleta numero: " + anclajes[total].getId());
			}else {
				System.out.println("En el anclaje " + (total + 1) + " no hay ninguna bicicleta.");
			}
		
		}
	}

	public void anclarBicicleta(Bicicleta bicicleta){
		
		//inserta el objeto bicicleta en el primer registro libre del array anclajes y llama a mostrarAnclaje()
		
		int numeroAnclaje = -1;
		for(int total = 0; total < getAnclajes().length; total ++){
			if(getAnclajes()[total]==null){
				setAnclaje(total, bicicleta);
				numeroAnclaje = total + 1;
				break;
			}
		}if(numeroAnclaje != -1){
			mostrarAnclaje(bicicleta, numeroAnclaje);
		}else {
			System.out.println("No se puede anclar, no hay espacio");
		}
				
		
	}

	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
		
		//muestra un mensaje con el id de la bicicleta anclada y en qué anclaje se ha anclado.
		if (numeroAnclaje != -1){
			System.out.println("La bicicleta " + bicicleta.getId() + "ha sido anclada en el numero: " + numeroAnclaje);
		}else {
			System.out.println("No se puede anclar, no hay espacio");
		}	
	}
	
	
	private void setAnclajes(int numeroAnclaje, Bicicleta bicicleta) {
		
		//Metodo que ancla una bicicleta a una posicion del array Anclaje.
		getAnclajes()[numeroAnclaje] = bicicleta;
	}
	

	public void leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		
		// comprueba si la tarjeta de usuario está activada
		return tarjetaUsuario.getActivada();
	}
	
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		
		//
	}
	
	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		
		//muestra un mensaje con el id de la bici y el número de anclaje donde estaba.
		System.out.println("Se ha retirado la " + bicicleta.getId() + "del anclaje numero " + numeroAnclaje);
		
	}
	
	public int generarAnclaje(){
		
	}

	
	
	
	
	
}
