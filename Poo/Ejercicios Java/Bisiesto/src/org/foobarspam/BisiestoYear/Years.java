package org.foobarspam.BisiestoYear;

public class Year {
	
	
	private int year;
	
	//Constructores
	public Year(Integer año){
		this.year = year;
	}
	
	//Setters y getters
	public Integer getYear(){
		return this.year;
	}
	
	public void any(Integer year){
		this.year = year;
	}

	public Boolean BisiestoYear(){
		this.year() % 4 == 0;
	}
}
