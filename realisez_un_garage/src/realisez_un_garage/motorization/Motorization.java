package realisez_un_garage.motorization;

public class Motorization {
	protected TypeOfEngine typeOfEngine = null;
	protected String cylinder = "";
	protected Double price = 0d;
	
	// Constructeur
	public Motorization(String cylinder, Double price) {
		super();
		this.cylinder = cylinder;
		this.price = price;
	}
	
	// Re-définition de la methode toString
	public String toString(){
		String str = "Moteur "+ this.typeOfEngine+" "+this.cylinder + " ( " + getPrice() + " € ) ";
		return str;
	}
	
	// Getter permet de récupérer le prix en dehors de la classe
	public Double getPrice(){
		return this.price;
	}
}
