package realisez_un_garage.option;

public class RoofRack implements Option {
	private final Double price = 29.9d; // Prix contant de la barre de toit
	private final String name = "Barre de toit";
	
	// Utilisation du polymorphisme de la méthode getPrice définie dans l'interface Option
	@Override
	public Double getPrice() {
		return this.price;
	}

	// Utilisation du polymorphisme de la méthode getName définie dans l'interface Option
	@Override
	public String getName() {
		return this.name;
	}
}
