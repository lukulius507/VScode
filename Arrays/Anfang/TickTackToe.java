package TickTackToKi;

public class TickTackToe {
	
	public static final int U=-1;
	public static final int X=2;
	public static final int O=0;
	public static final int UNENTSCHIEDEN=1;
	
	public static int feld[][]= {
				{X,O,O},
				{O,X,O},
				{O,O,X}
		};

	public static void main(String[] args) {
		ausgabe();
		System.out.println(auswertung());
		max();
	}
	
	

	private static void max() {
		// TODO Auto-generated method stub
		
	}



	private static void ausgabe() {
		
	for(int y=0;y<feld.length;y++) {
		for (int x = 0; x < feld.length; x++) {
			System.out.print("\t"+feld[y][x]);
			
		}
		System.out.println(" ");
	}
		
	}
	/*
	 * liefert 2, wenn X gewonnen hat
	 * liefert 0, wenn O gewonnen hat
	 * liefert 1, wenn es unentschieden ist
	 * liefert -1, wenn es nicht klar ist
	 */
	
	private static int auswertung() {
		
		// Prüfe Horizontale(Zeile) für 2
		if(feld[0][0]==X&&feld[0][1]==X&&feld[0][2]==X) return X;
		if(feld[1][0]==X&&feld[1][1]==X&&feld[1][2]==X) return X;
		if(feld[2][0]==X&&feld[2][1]==X&&feld[2][2]==X) return X;
		
		// Prüfe Vertikale(Spalte) für 2
		if(feld[0][0]==X&&feld[1][0]==X&&feld[2][0]==X) return X;
		if(feld[0][1]==X&&feld[1][1]==X&&feld[2][1]==X) return X;
		if(feld[0][2]==X&&feld[1][2]==X&&feld[2][2]==X) return X;
		
		// Prüfe Diagonale für 2
		if(feld[0][0]==X&&feld[1][1]==X&&feld[2][2]==X) return X;
		if(feld[0][2]==X&&feld[1][1]==X&&feld[2][0]==X) return X;
		
		// Prüfe Horizontale(Zeile) für 0
		if(feld[0][0]==O&&feld[0][1]==O&&feld[0][2]==O) return O;
		if(feld[1][0]==O&&feld[1][1]==O&&feld[1][2]==O) return O;
		if(feld[2][0]==O&&feld[2][1]==O&&feld[2][2]==O) return O;
		
		// Prüfe Vertikale(Spalte) für 0
		if(feld[0][0]==O&&feld[1][0]==O&&feld[2][0]==O) return O;
		if(feld[0][1]==O&&feld[1][1]==O&&feld[2][1]==O) return O;
		if(feld[0][2]==O&&feld[1][2]==O&&feld[2][2]==O) return O;
		
		// Prüfe Diagonale für 0
		if(feld[0][0]==O&&feld[1][1]==O&&feld[2][2]==O) return O;
		if(feld[0][2]==O&&feld[1][1]==O&&feld[2][0]==O) return O;
		
		//wenn noch ein Zug möglich ist
		//und noch kein Spieler gewonnen hat
		for(int y=0;y<feld.length;y++) {
			for(int x=0;x<feld.length;x++) {
				if(feld[y][x]==U) {
					return U;
				}
			}
		}
		
		
		//Es ist kein Zug mehr möglich
		return UNENTSCHIEDEN;
		
		
		
	}


}