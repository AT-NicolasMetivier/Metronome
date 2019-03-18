package fr.atenotech.nmetivier;

import java.util.Scanner;

/**
 * 
 * @author Nicolas.Metivier
 *
 */
public final class MetronomProgram {

	/**
	 * Fonction principale.
	 * Point d'entr� de l'application.
	 * @param args Parametres � renseigner lors de l'appel su program via script.
	 */
	public static void main(String[] args) {
		// Appel de la fonction machin machin...
		launchTempo();
	}
	
	private static void launchTempo() {
		// D�claration des des variables.
		TempoThread tempo = new TempoThread();
		Scanner keyboard = new Scanner(System.in);
		boolean isLooping = true;
		
		// Lancement du thread.
		tempo.start();
		
		// Tant que ca boucle...
		while (isLooping) {
			// On r�cup�re e nouveau TEMPO.
			System.out.print("Entrez un nouveau tempo (0-1024) ou RETURN pour quitter : ");
			String userChoice = keyboard.nextLine();
			
			// On v�rifie que c'est un nombre valide...
			if (isNumber(userChoice)) {
				// Si c'est OK, ben... OK !
				Console.setBpm(Short.parseShort(userChoice));
			} else { // SInon....
				// On v�rifie que la STRING contient RETURN.
				if (userChoice.toLowerCase().contains("return")) {
					// On arete le thread.
					tempo.terminate();
					isLooping = false;
				}
			}
		}
	}
	
	/**
	 * Fonction qui v�rifie qu'on a un nombre.
	 * @param value Valeur � v�rifier.
	 * @return TRUE si c'est un nombre.
	 */
	private static boolean isNumber(String value) {
		try {
			Short.parseShort(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
