package a07;

public class TageDesMonats {
	/**
	 * Monate haben 30 oder 31 Tage Februar hat 28 oder 29 (bei Schaltjahr) Tage;
	 * 
	 * 
	 * bedingungen für Schaltjahr: 
	 * 1. Das Jahr ist durch 4 ohne Rest teilbar 
	 * 2. Das Jahr darf nicht durch 100 ohne Rest teilbar sein, es sei denn es sei ndurch
	 * 400 ohne Rest teilbar.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Eingabe
		int monat = 1;
		int tageM = 0;
        int jahr= 2022;
        
        //Verarbeitung 
        switch (monat) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8: 
        case 10:
        case 12:
        	tageM=31;
        	break;
        case 4:
        case 6:	
        case 9:
        case 11:
        	tageM=30;
        	break;
        case 2:
        	
        	//Prüfung Schaltjahr 
        	if( jahr%4==0 && (jahr%100!=0 || jahr %400==0)) {
        		tageM=29;break;
        		
        		
        		}else {
        			tageM=28;break;
        		}
        default:
        	break;
        	
        	
        	
        }
        System.out.println("Der Monat "+ monat +"im Jahr "+jahr+"hat"+ tageM +"Tage. " );
	}

}
