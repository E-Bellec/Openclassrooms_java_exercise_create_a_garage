package realisez_un_garage;

import java.util.List;

import realisez_un_garage.vehicle.Vehicle;

public class CarWorkshop {
	private List<Vehicle> carList = null;
	
	// Re-définition de la methode toString
	public String toString(){
		String str = "****************************" 
			+ "** Garage OpenClassrooms **"
			+ "****************************\n\n";
		
		// Si le garage contient des véhicules, on ajoute la liste dans la varriable str
		if ( carList != null ) {
			
			// On parcourt la liste de véhicules
			for ( Vehicle car : carList  ) {
				

				// !!!!!!!!!! A REVOIR
				str += "+ Voiture " ;
				
			}
			
		} else {
			// Si non le Garage est vide
			str += "Le garage ne contienr pas de véhicule";
		}
		
		return str;
	}
	
	// Function d'ajout de véhicule et qui accepte en paramètre un objet de type "Vehicle"
	public void addVehicle( Vehicle vehicle ) {
		
	}
}
