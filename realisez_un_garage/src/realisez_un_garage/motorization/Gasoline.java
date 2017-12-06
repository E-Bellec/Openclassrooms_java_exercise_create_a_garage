package realisez_un_garage.motorization;

public class Gasoline extends Motorization {
	
	public Gasoline(String cylinder, Double price) {
		super(cylinder, price);
		this.typeOfEngine = TypeOfEngine.ESSENCE;
	}
}
