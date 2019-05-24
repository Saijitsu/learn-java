
public class MainMethode {

	// redéfinition de méthode => La signature doit être différente
	// La signature de la méthode doit être différente nom + Type paramètre
	public static void main(String[] args) {
		for (String str : args) {
			System.out.println(str);
		}
		System.out.println(mul(1,2));
		System.out.println(mul(3.0,7.0));
	}

	// Les deux fonctions mul sont possible car elles n'ont pas la même signature (int/double)
	/**
	 * Methode qui multiplie deux int
	 * @author John+
	 * @param a
	 * @param b
	 * @return
	 */
	static int mul(int a, int b) {
		System.out.println("int");
		return a * b;
	}
	
	/**
	 * Methode qui multiplie deux double
	 * @author Arthur
	 * @param a
	 * @param b
	 * @return
	 */
	static double mul(double a, double b) {
		System.out.println("Double");
		return a * b;
	}
}
