package realisez_un_garage.motorization;

public class Diesel extends Motorization {
	
	public Diesel( String cylinder, Double price) {
		super(cylinder, price);
		this.typeOfEngine = TypeOfEngine.DIESEL;
	}
}
