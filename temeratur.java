package a07;

public class temeratur {
	/**
	 * In einem Raum wird die Aktuelle Temeratur gemessen 
	 * erfasst
	 * Ein Program soll eien Alarm ausgeben, wenn die Temperatur unterhalb einer TEMP_MAX liegt.
	 * Die Ausgabe soll "Temeratur zu niedrig" oder "Temeratur zu hoch" sein. 
	 * 
	 *@param args 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Eingabe - erfasse eine Temeratur 
		
		double temp = 21.8;
		final int TEMP_MIN= 15;
		final int TEMP_MAX = 30;
		String TempIst;
		
		//Verarbeitung 
		if(TEMP_MIN<TEMP_MAX) {
		
		if (temp>= TEMP_MAX) {
			TempIst = "Temp zu hoch"; }
		else if (temp<=TEMP_MIN) {
			TempIst= "Temp zu niedrig"; }
		
		else { TempIst="Temp = "+temp+" C";
		}
		} else {
			TempIst = "TEMP_MAX muss größer als TEMP_MIN sein";
		}
			//Ausgabe 
			System.out.println(TempIst);
		
		}
		
		
	}


