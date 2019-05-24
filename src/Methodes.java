
public class Methodes {

	public static void main(String[] args) {
		hello();
		afficherDouble(42.0);
		multiplicateur(3.0, 9.0);
		double d = 12.0;
		System.out.println(tstsup5(d));
		StringBuffer t = new StringBuffer("azerty");
		affStr(t);
		System.out.println(t);
	}

	// Création de la méthode
	static void hello() { // static va simuler le procédural
		System.out.println("Bonjour");
	}

	static void afficherDouble(double d) {
		System.out.println(d);
	}

	static double multiplicateur(double a, double b) {
		return a * b;
	}

	static boolean tstsup5(double a) {
		a = 30;
		return a > 5;
	}

	static void affStr(StringBuffer bf) {
		bf.reverse(); // Modifie l'état de l'objet : a une conséquence (c'est une méthode)
		bf = new StringBuffer("aqw"); // N'a pas de conséquence : n'est pas une méthode, ne modifie pas l'objet
		System.out.println(bf);
	}

}
