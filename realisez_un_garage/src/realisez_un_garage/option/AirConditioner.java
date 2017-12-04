package realisez_un_garage.option;

public class AirConditioner implements Option {
	private final Double price = 347.3d; // Prix contant de la barre de toit
	
	// Utilisation du polymorphisme de la méthode getPrice définie dans l'interface Option
	public Double getPrice() {
		return this.price;
	}
}
