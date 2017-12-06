package realisez_un_garage.vehicle;

import realisez_un_garage.Brand;

public class A300B extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 28457.0d;

	// Constructeur
	public A300B() {
		super();
		this.brand = Brand.PIGEOT;
		this.name = "A300B";
	}

	// Getter permet de récupérer le prix en dehors de la classe
	public Double getPrice() {
		return price;
	}
	
}