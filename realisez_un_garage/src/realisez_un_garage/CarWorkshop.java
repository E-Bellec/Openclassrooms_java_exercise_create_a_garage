package realisez_un_garage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import realisez_un_garage.vehicle.Vehicle;

public class CarWorkshop {
	private List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	/* (non-Javadoc)
	 * Re-définition de la methode toString
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		BufferedReader bufferedReader = null;
		InputStreamReader inputStreamReader = null;
		FileInputStream fis = null;
		File file = null;
		final String fileName = "vehicleList.txt";
		String txtFileContents = new String();
		String str = new String(
			"***************************\r" +
			"** Garage OpenClassrooms **\r" +
			"***************************\n"
		);

		// On récupère les données du fichier
		try {
			Path path = Paths.get(fileName);
		    
			// Si le fichier existe
			if ( Files.exists(path) ) {
				
				file = new File(fileName);
				fis = new FileInputStream(file);
				inputStreamReader = new InputStreamReader(fis, "UTF-8" );
				bufferedReader = new BufferedReader(inputStreamReader);
				String lineFile;

				// Nous récupérons les lignes du fichier
				while( (lineFile = bufferedReader.readLine()) != null) {
					
					// On ajoute la ligne parcourue dans la varrable
					txtFileContents += lineFile + "\n";
				}
				
				// Si le contenu du fichier est vide
				if ( txtFileContents.length() == 0 ) {
					
					// On indique que le garage ne contient pas de véhicule dans las variable de retour
					str += "\tLe garage ne contien pas de véhicule\n";
				} else {
					// On Ajoute le contenu du fichier dans la variable de retour
					str += txtFileContents;
				}
				
				// Fermeture du buffer et de l'inputStream
				fis.close();
				inputStreamReader.close();
				bufferedReader.close();
				
			} else {
				// Si le fichier n'exsite pas on le crée
				PrintWriter writer = new PrintWriter( fileName, "UTF-8" );
				System.out.println("Le fichier \"" + fileName + "\" n'existe pas ! ");
				
				// Fermeture du PrintWriter
				writer.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// On ferme nos flux de données dans un bloc finally pour s'assurer
			// que ces instructions seront exécutées dans tous les cas même si
			// une exception est levée !
			try {
				if (fis != null) {
					fis.close();
				}
				
				if (inputStreamReader != null) {
					inputStreamReader.close();
				}
				
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				
			} catch (IOException e) {
	            e.printStackTrace();
			}
		} // FIN TRY CATCH FINALY	
		
		return str; 
	} // Fin méthode toString
	
	
	/**
	 * Methode d'ajout de véhicule et qui accepte en paramètre un objet de type "Vehicle"
	 * @param vehicle
	 */
	public void addVehicle( Vehicle vehicle ) {
		
		// On ajoute le nouveaux véhicule dans la liste du garage
		this.vehicleList.add(vehicle);
	}


	
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}


}
