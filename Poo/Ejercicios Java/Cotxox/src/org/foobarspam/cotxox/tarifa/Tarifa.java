package org.foobarspam.cotxox.tarifa;
import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {

	// -------------------- Propiedades --------------------
	
	public double costeMilla = 1.35; //En euros
	public double costeMinuto = 0.35; //En euros
	public int costeMinimo = 5; //En euros
	public int porcentajeComision = 20; //En porcentaje %
	
	// -------------------- Constructores --------------------
	
	public Tarifa(){
		
	}

	public Tarifa(double costeMilla, double costeMinuto, int costeMinimo, int porcentajeComision) {
		this.costeMilla = costeMilla;
		this.costeMinuto = costeMinuto;
		this.costeMinimo = costeMinimo;
		this.porcentajeComision = porcentajeComision;
	}

	
	
	//-------------------------Getters & Setters---------------------------
	
	public double getCosteMilla() {
		return this.costeMilla;
	}

	public double getCosteMinuto() {
		return this.costeMinuto;
	}

	public int getCosteMinimo() {
		return this.costeMinimo;
	}

	public int getPorcentajeComision(){
		return this.porcentajeComision;
	}
	
	//-----------------------------Metodos-------------------------------------
	
	public double getCosteDistancia(distancia){
		
		double costeMilla = 1.35;
		double distancia = 0;
		int costeMinimo = 5;
		
		if (totalMilla = costeMinimo + distancia * costeMilla){
			System.out.println("El total de coste de distancia es: " + totalMilla);
		}else { (totalMilla <= 0)
			System.out.println("No a estado ni un minuto");
		}
		return totalMilla;
	}
	
	public int getCosteTiempo(minutos){
		
		int tiempoCarrera = 0;
		double costeMinuto = 0.35;
		int costeMinimo = 5;
		
		if {
			totalMinuto = costeMinimo + tiempoCarrera * costeMinuto;
			System.out.println("El total de coste de tiempo es: " + totalMinuto);
		}else {
			totalMinuto = 0;
			System.out.println("No a recorrido ni una milla");
		}
		return totalMinuto;
	}
	
	public double getCosteTotalEsperado(carrera){
		
		//devuelve el coste total esperado de la carrera que recibe en función de la distancia esperada
		
		//int costeMinimo = 5;
		//int tiempoCarrera = 0;
		//int milla = 0;
		//
		//if(total = 5; total < costeMinimo; total ++){
		//	costeTotalMinuto = tiempoCarrera * costeMinuto;
		//	costeTotalMilla = milla * costeMilla;
		//	costeTotalEsperado = total + costeTotalMinuto + costeTotalMilla;
		//}
		//return this.CosteTotalEsperado;
		
		if(costeTotal = totalMilla * totalMinuto){
			System.out.println("El total de todo es: " + costeTotal);
		}
		return costeTotal;
	}
	
}
