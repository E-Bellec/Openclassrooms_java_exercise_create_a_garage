package realisez_un_garage.vehicle;

import realisez_un_garage.Brand;

public class Lagouna extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 23123.0d;
	
	public Lagouna() {
		super();
		this.brand = Brand.RENO;
		this.name = "Lagouna";
	}

	public Double getPrice() {
		return price;
	}
	
}
