package realisez_un_garage.option;

public class Gps implements Option{
	private final Double price = 113.5d; // Prix contant du Gps
	
	// Utilisation du polymorphisme de la méthode getPrice définie dans l'interface Option
	public Double getPrice() {
		return this.price;
	}
}
