package realisez_un_garage.option;

public class ElectriGlass implements Option {
	private final Double price = 212.35d; // Prix des vitres electriques
	private final String name = "Vitre électrique";
	
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
