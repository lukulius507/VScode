package a07;

public class wochentage {

	public static void main(String[] args) {
		
		//Eingabe 
		//Montag sei 0, Dienstag 1, Mittwoch 2, ... ,Sonntag 6
		
		int t = 19;
		int m = 12;
		int j = 2022;
		
		int amt = 11;
		int wt = 0;
		int zT= aT%7;
		
		//Verarbeitung 
		int heuteWt=0;
		switch (wt) {
		case 0:wt= "Montag"; break;
		case 1:wt= "Dienstag" ; break;
		case 2:wt= "Mitwoch" ;break;
		case 3:wt= "Donnerstag"; break;
		case 4:wt= "Freitag"; break;
		case 5:wt= "Samstag" ; break;
		case 6:wt= "Sonntag";  break;
	
		
			
			default:
				break;
		}
		
		
		//Ausgabe 
			System.out.println("In "+aT +"");
				
	}

}
