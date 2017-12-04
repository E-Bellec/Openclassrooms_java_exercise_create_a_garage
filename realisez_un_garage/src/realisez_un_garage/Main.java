package realisez_un_garage;

public class Main {
	
	public static void main(String[] args) {
		boolean userWantsToCloseTheProgram = false;
		
		// On souhaite la bienvenu à l'utilisateur
		System.out.println("Bienvenue dans le programme de rangement de véhicules!");
		
		// 
		
		
		
		
		CarWorkshop carWorkshop = new CarWorkshop();   
		System.out.println(carWorkshop);
	}
	
	
	/**
	 * Function qui demande à l'utilisateur :
	 * 	- si il souhaite ranger un véhcule
	 *  - Si il shouhaite fermer le programe
	 * @return true/false en fonction de la saisie de l'utilisateur
	 */
	public boolean requestStoringVehicleOrClosingTheProgram() {
		boolean result = false;
		
		return result;
	}
}
