package realisez_un_garage;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import realisez_un_garage.motorization.Diesel;
import realisez_un_garage.motorization.Electric;
import realisez_un_garage.motorization.Gasoline;
import realisez_un_garage.motorization.Hybrid;
import realisez_un_garage.option.AirConditioning;
import realisez_un_garage.option.ElectriGlass;
import realisez_un_garage.option.Gps;
import realisez_un_garage.option.HeatedSeat;
import realisez_un_garage.option.RoofRack;
import realisez_un_garage.vehicle.A300B;
import realisez_un_garage.vehicle.D4;
import realisez_un_garage.vehicle.Lagouna;
import realisez_un_garage.vehicle.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		CarWorkshop carWorkshop = new CarWorkshop();   
		System.out.println(carWorkshop);
		
		Vehicle lag1 = new Lagouna();
		lag1.setMotorization(new Gasoline("150 Chevaux", 1256d));
		lag1.addOption(new Gps());
		lag1.addOption(new HeatedSeat());
		lag1.addOption(new ElectriGlass());
		carWorkshop.addVehicle(lag1);
	   		 
		Vehicle A300B_2 = new A300B();
		A300B_2.setMotorization(new Electric("1500 W", 1234d));
		A300B_2.addOption(new AirConditioning());
		A300B_2.addOption(new RoofRack());
		A300B_2.addOption(new HeatedSeat());
		carWorkshop.addVehicle(A300B_2);
		
		Vehicle d4_1 = new D4();
		d4_1.setMotorization(new Diesel("200 Hdi", 5684.80d));
		d4_1.addOption(new RoofRack());
		d4_1.addOption(new AirConditioning());
		d4_1.addOption(new Gps());
		carWorkshop.addVehicle(d4_1);   	 
		
		Vehicle lag2 = new Lagouna();
		lag2.setMotorization(new Diesel("500 Hdi", 6987d));
		carWorkshop.addVehicle(lag2);
		
		Vehicle A300B_1 = new A300B();
		A300B_1.setMotorization(new Hybrid("ESSENCE/Electrique", 2345.95d));
		A300B_1.addOption(new ElectriGlass());
		A300B_1.addOption(new RoofRack());
		carWorkshop.addVehicle(A300B_1);
		
		Vehicle d4_2 = new D4();
		d4_2.setMotorization(new Electric("100 KW", 1224d));
		d4_2.addOption(new HeatedSeat());
		d4_2.addOption(new RoofRack());
		d4_2.addOption(new AirConditioning());
		d4_2.addOption(new Gps());
		d4_2.addOption(new ElectriGlass());
		carWorkshop.addVehicle(d4_2);
		
		// Appel de la méthode permettant décrivait dans le fichier pour la sauvegarde du garage
		writeTheVehiculeListToTheFile(carWorkshop);
	}

	/**
	 * Methode permettant de sauguarder le garage
	 * Lit et écrit dans un fichier
	 * @param carWorkshop permet de récupérer la liste des véhicules
	 */
	public static void writeTheVehiculeListToTheFile( CarWorkshop carWorkshop ) {
		BufferedOutputStream bufferedOutputStream = null;
		BufferedReader bufferedReader = null;
		FileOutputStream fileOutputStream = null;
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		File file = null;
		String txtFileContents = new String();
		final String fileName = "vehicleList.txt";
		List<Vehicle> vehicleList = carWorkshop.getVehicleList();
		
		// Bloc try pour gérer les exception de lecture et d'écriture du fichier
		try {
			Path path = Paths.get(fileName);
			
			// Si le fichier n'existe pas on le crée
			if ( ! Files.exists(path) ) {
				
				// Si le fichier n'exsite pas on le crée
				PrintWriter writer = new PrintWriter( fileName, "UTF-8" );
				System.out.println("Le fichier \"" + fileName + "\" n'existe pas ! \n Il vient donc d'être crée. ");
								
				// Fermeture du PrintWriter
				writer.close();
			}
			
			// Instanciation des objets permettant la lecture et l'écriture du fichier
			file = new File(fileName);
			fileInputStream = new FileInputStream(file);
			inputStreamReader = new InputStreamReader(fileInputStream, "UTF8");
			bufferedReader = new BufferedReader(inputStreamReader);
			fileOutputStream = new FileOutputStream(file);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			String lineFile;

			// On boucle sur les lignes du fichier
			while( (lineFile = bufferedReader.readLine()) != null) {
				
				// On ajoute la ligne parcourue dans la varrable de contenue du fichier
				txtFileContents += lineFile + "\n";
			}
			
			// On boucle sur la liste des nouveau véhicules à ajouter dans le fichier
			for ( int numberVehicule = 0; numberVehicule < vehicleList.size(); numberVehicule++) {
				
				// On ajoute le véhicule dans la varriable qui contient toutes la liste des véhicule
				txtFileContents += vehicleList.get(numberVehicule).toString();
			}
		
			// On écrit dans le fichier la liste des véhicules (déjas présent ainsi que les nouveaux véhicule)
			fileOutputStream.write( txtFileContents.getBytes(StandardCharsets.UTF_8) );
			
			// Fermeture des objets de lécture/écriture
			fileInputStream.close();
			inputStreamReader.close();
			bufferedReader.close();
			fileOutputStream.close();
			bufferedOutputStream.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// On ferme nos flux de données dans un bloc finally pour s'assurer
			// que ces instructions seront exécutées dans tous les cas même si
			// une exception est levée !
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (fileInputStream != null) {
					fileOutputStream.close();
				}
				
				if (bufferedOutputStream != null) {
					bufferedOutputStream.close();
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
	} // Fin methode writeTheVehiculeListToTheFile
}
