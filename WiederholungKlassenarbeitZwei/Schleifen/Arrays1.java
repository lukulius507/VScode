package Methoden;

public class Arrays1 {

	public static void main(String[] args) {

		String[] names = new String[3];
		
		names[0] = "Hendrik";
		names[1] = "Paul";
		names[2] = "Fabienne";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);   // names [i] i in eckingen klammern nicht vergessen.
		}

	}

}
