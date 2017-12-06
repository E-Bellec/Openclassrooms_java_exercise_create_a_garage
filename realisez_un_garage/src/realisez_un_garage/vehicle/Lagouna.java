package realisez_un_garage.vehicle;

import realisez_un_garage.Brand;

public class Lagouna extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 23123.0d;
	
	// Constructeur
	public Lagouna() {
		super();
		this.brand = Brand.RENO;
		this.name = "Lagouna";
	}

	// Getter permet de récupérer le prix en dehors de la classe
	public Double getPrice() {
		return price;
	}
	
}
