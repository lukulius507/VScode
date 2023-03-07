package a07;

public class verzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Eingabe 
		
		String akkNutzer = "";
		String user1 = "Lukas";
		String user2 = "Maier";
		String passwort = "123";
		String meldung;
		akkNutzer=user1;
		
		//Verarbeitung 
		
		if ((akkNutzer==user1 || akkNutzer==user2) && passwort == "123") {
			meldung = "login Stimmt";
		}
		else {
			meldung  = "login falsch";
			
			
		}
		
		//Ausgabe 
		System.out.println(meldung);
	}

}
