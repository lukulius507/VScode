# Arrays Test

package ArrayEinf�hrung;

public class Arrays {

	public static void main(String[] args) {
	
		int[] lotto = {3,5,13,23,36,39};
		
		//Einen Wert �ndern 
		lotto[2] = 14;
				
		//Fehler 
		//lotto[7]=4; zugriff auf ung�ltigen index
		
		//lotto[1] = 1.5; compilation Problem da dieses Array nur ganze zahlen erlaubt
		
        // Ausgabe 
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i+1)+ ". Zahl: "+ lotto [i] );
		}
	}

}