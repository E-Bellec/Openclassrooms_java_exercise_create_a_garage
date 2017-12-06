package realisez_un_garage.vehicle;

import realisez_un_garage.Brand;

public class D4 extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 25147.0d;
	
	public D4() {
		super();
		this.brand = Brand.TROEN;
		this.name = "D4";
	}

	public Double getPrice() {
		return price;
	}
	
}
