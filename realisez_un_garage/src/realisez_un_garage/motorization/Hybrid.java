package realisez_un_garage.motorization;

public class Hybrid extends Motorization {
	// Cobstructeur
	public Hybrid(String cylinder, Double price) {
		super(cylinder, price);
		this.typeOfEngine = TypeOfEngine.HYBRIDE;
	}
	
}
