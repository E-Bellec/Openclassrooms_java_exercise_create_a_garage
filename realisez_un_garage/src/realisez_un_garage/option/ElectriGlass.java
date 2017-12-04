package realisez_un_garage.option;

public class ElectriGlass implements Option {
	private final Double price = 212.35d; // Prix contant de la barre de toit
	
	// Utilisation du polymorphisme de la méthode getPrice définie dans l'interface Option
	public Double getPrice() {
		return this.price;
	}
}
