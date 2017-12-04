package realisez_un_garage.vehicle;

import java.util.List;

import realisez_un_garage.Brand;
import realisez_un_garage.option.Option;

public abstract class Vehicle implements Option{
	private Double price = 0d;
	private String name = "noName";
	private Brand brand = null;
	private List<Option> optionList = null;
	
	// Re-définition de la methode toString
	public String toString(){
		String str = "Voiture ";
		
		return str;
	}
	
	// Fonction d'ajout d'option qui accepte que les objets du type option
	public void addOption( Option option ) {
		
		// On alimente la liste d'option du véhicule
		
	}
	
	
}
