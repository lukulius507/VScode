package Übungen_Pseudocode;

public class lottoSortieren {

	public static void main(String[] args) {

		int[] lotto = new int[] { 6, 5, 43, 100, 4, 30 };
		int[] lottoSortiert = SortiereArray(lotto);
		for (int i = 0; i < lottoSortiert.length; i++) {
			System.out.println(lotto[i]);
		}
	}

	private static int[] SortiereArray(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length; j++) {
				int merke = 0;
				if (lotto[i] < lotto[j]) {
					merke = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = merke;

				}
			}
		}
		return lotto;
	}

}
