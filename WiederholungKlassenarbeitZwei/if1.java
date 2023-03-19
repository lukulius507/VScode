package ifAbfragen;

public class if1 {

	public static void main(String[] args) {

		int code = 1234;
		int z1, z2, z3, z4;

		// Verarbeitung

		// z1 = code / 1000;

		// z2 = code -z1 * 1000;
		// z2 = z2 / 100;

		z4 = code % 10;

		code = code / 10;
		z3 = code % 10;
		
		code = code / 10;
		z2 = code % 10;
		
		code = code / 10;
		z1 = code % 10;

		// Ausgabe
		System.out.println("Der Code lautet: " + code);

		System.out.println("Die 1. Ziffer lautet " + z1);
		System.out.println("Die 2. Ziffer lautet " + z2);
		System.out.println("Die 3. Ziffer lautet " + z3);
		System.out.println("Die 4. Ziffer lautet " + z4);

	}

}
