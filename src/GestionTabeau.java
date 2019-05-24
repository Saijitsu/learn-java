
public class GestionTabeau {

	public static void main(String[] args) {
		int tab[] = { 2, -3, 1, 9 };
		int tab1[] = null;
		System.out.println(minimum(tab));
	}

	static int minimum(int[] tab) {
		if (tab != null) {
			int min = tab[0];
			for (int i = 1; i < tab.length; i++) {
				if (tab[i] < min) {
					min = tab[i];
				}
			}
			return min;
		}
		return 0;
	}
}
