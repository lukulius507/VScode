package a07;

public class Menue {
	/**
	 * Ein Menü zeigt drei Befehle zur Auswahl Die Zahl 1 wählt das Menü 1, 2 das
	 * Menü 2 usw.
	 * 
	 * Als Ausgabe soll die gewählte MenüNr ausgeben werden Verwenden sie hierzu
	 * Switsh case
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

		// Eingabe
		System.out.println("1. Neue Eingabe ");
		System.out.println("2. Geburstdatum eingeben");
		System.out.println("3. Strasse eingeben ");
		
		int in = 1;
		switch (in) {
		case 1:System.out.println("Geben sie Ihren Namen ein. ");
		break;
		case 2:System.out.println("Geben sie ihr Geburtstag ein. ");
		break;
		case 3:System.out.println("Geben ihre Strasse ein");
		break;
		
		default:
			System.out.println("Programm Beenndet");
			break;
		}
		
		
		
	}

}
