package realisez_un_garage.motorization;

import realisez_un_garage.TypeOfEngine;
import realisez_un_garage.vehicle.Vehicle;

public class Motorization {
	private TypeOfEngine typeOfEngine = null;
	private String cylinder = "";
	private Double price = 0d;
	
	// Constructeur
	public Motorization(TypeOfEngine typeOfEngine, String cylinder, Double price) {
		super();
		this.typeOfEngine = typeOfEngine;
		this.cylinder = cylinder;
		this.price = price;
	}
	
	// Re-définition de la methode toString
	public String toString(){
		String str = "****************************" 
			+ "** Garage OpenClassrooms **"
			+ "****************************\n";
		
		
		
		return str;
	}
	
}
