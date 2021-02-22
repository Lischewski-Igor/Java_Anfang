
public class AufgabeII {

	public static void main(String[] args) {
		
		/*
		 * Aufgabe:
		 * 
		 * 1. Auto kostet: 3500
		 * 2. Auto kostet: 2340,48
		 * 
		 * 1. Daten in Variablen abspeichern
		 * 2. Kommazahl umwandeln zu einer Ganzzahl
		 * 3. Beide Ganzzahlen zu einem Gesamtbetrag verreichnen
		 * 4. Gesamtbetrag ausgeben mit Hilfe von System.out.println("");
		 */
		
		int auto = 3500;
		double auto1 = 2340.48;
		
		int auto2 = (int)auto1;
		
		int gesamtBetragAutos = auto + auto2;
		
		System.out.println("Gesamtebetrag ist: " + gesamtBetragAutos + "€");

	}

}
