package realisez_un_garage.motorization;

public class Electric extends Motorization {

	// Constructeur
	public Electric(String cylinder, Double price) {
		super(cylinder, price);
		this.typeOfEngine = TypeOfEngine.ELECTRIQUE;
	}

}
