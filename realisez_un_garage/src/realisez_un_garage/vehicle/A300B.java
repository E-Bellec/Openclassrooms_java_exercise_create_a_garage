package realisez_un_garage.vehicle;

import realisez_un_garage.Brand;

public class A300B extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 28457.0d;

	public A300B() {
		super();
		this.brand = Brand.PIGEOT;
		this.name = "A300B";
	}

	public Double getPrice() {
		return price;
	}
	
}