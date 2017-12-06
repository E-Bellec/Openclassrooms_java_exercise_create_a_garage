package realisez_un_garage.vehicle;

import java.util.ArrayList;
import java.util.List;

import realisez_un_garage.motorization.Motorization;
import realisez_un_garage.option.Option;

public abstract class Vehicle {
	protected Double price = 0d;
	protected String name = "noName";
	protected List<Option> optionList = new ArrayList<Option>();
	protected Brand brand = null;
	protected Motorization motorization = null;
	
	
	public Double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public List<Option> getOptionList() {
		return optionList;
	}

	public Brand getBrand() {
		return brand;
	}
	
	public Motorization getMotorization() {
		return motorization;
	}
	
	// Setter permettant d'ajouter la motorisation dans l'objet "vehicle"
	public void setMotorization(Motorization motorization) {
		this.motorization = motorization;
	}
	
	/* (non-Javadoc)
	 * Re-définition de la methode toString
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		// On récupère le prix du model nue grace au polymorphisme de la methode getPrice
		price = getPrice();
		String str = " + Voiture " + getBrand() +  " : " + getName() + " au prix sans accesoisre ni moteur de " + price + " avec le" + getMotorization().toString();
		List<Option> optionList = getOptionList();
		
		// On ajoute le prix du moteur au véhicule
		price += getMotorization().getPrice(); 
		
		
		// Si la liste d'option nest pas vide
		if ( ! optionList.isEmpty() ) {
			
			// Debut de la liste
			str += "[ ";
			
			// On boucle sur la liste des options
			for ( int numberOption = 0; numberOption < optionList.size(); numberOption ++  ) {
				
				// On récupère l'option courrante
				Option option = optionList.get(numberOption);
				Double optionprice = option.getPrice();
				// Ici je récupère le nom par la méthode polymorphe getName ( Le nom de la classe étant en anglais j'ai été obligé de passer par cette méthode )
				// Pour l'exercie, j'aurais du utiliser : option.getClass().getName() pour récupérer le nom de l'option ajouté
				String optionName = option.getName();
				
				// On ajoute le prix de l'option au prix du véhicule
				price += optionprice;
				
				// Si on est au premier passage de la boucle
				if ( numberOption == 0 ) {
					
					// On ajoute dans la chaine de caratères le nom et le prix de l'option
					str += optionName + " (" + optionprice.toString() + " € )";
				} else {
					// Si non on ajoute une virgule suivie du nom et du prix de l'option
					str += ", " + optionName + " (" + optionprice.toString() + " € )";
				}
				
			} // FIN de boucle de la liste des options
			
			// Fin de la liste
			str += " ] ";
		}
		
		str += "d'une valeur totale de  " + price.toString() + " €\n";
		
		return str;
	} // FIN methode toString

	
	
	/**
	 * Méthode d'ajout d'option qui accepte que les objets du type option
	 * @param option
	 */
	public void addOption( Option option ) {
		
		// On ajoute l'option dans l'objet contenant la list d'option
		this.optionList.add(option);
	}
}
