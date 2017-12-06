package realisez_un_garage.vehicle;

public class D4 extends Vehicle {
	
	// Prix du modèle sans option ni moteur
	private Double price = 25147.0d;
	
	// Constructeur
	public D4() {
		super();
		this.brand = Brand.TROEN;
		this.name = "D4";
	}

	// Getter permet de récupérer le prix en dehors de la classe
	public Double getPrice() {
		return price;
	}
}
