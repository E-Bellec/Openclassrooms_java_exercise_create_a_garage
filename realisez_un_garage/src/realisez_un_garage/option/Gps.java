package realisez_un_garage.option;

public class Gps implements Option{
	private final Double price = 113.5d; // Prix contant du Gps
	private final String name = "Gps";

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
