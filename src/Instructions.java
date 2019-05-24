
public class Instructions {

	public static void main(String[] args) {
		System.out.println(minimun(4, -1));
		System.out.println(minimun(1, 4));
		System.out.println(jourSemaine(6));// Test le jour 1
		System.out.println(interval(1, 2, 3));
		System.out.println(interval(2, 1, 1));
		System.out.println(interval(1, 2, 1));
		calculatrice('+', 1, 3);
		calculatrice('-', 1, 3);
		calculatrice('/', 1, 3);
		calculatrice('/', 3, 1);
		calculatrice('/', 3, 0);
		calculatrice('*', 1, 3);
		System.out.println(tstWhile(10));
		System.out.println(tstDoWhile(10));
		tableMult(1);
		System.out.println(factoriel(3));
		System.out.println(factorielRecursif(3));
		tstBreak();
		tstContinue();
		tstLabel();
	}

	static int minimun(int a, int b) {
//		if (a < b) {
//			return a;
//		} else {
//			return b;
//		}
		return a < b ? a : b;
	}

	static String jourSemaine(int jour) {
		String tmp = null;

		switch (jour) {
		case 1:
			tmp = "lundi";
			break;
		case 2:
			tmp = "mardi";
			break;
		case 3:
			tmp = "mercredi";
			break;
		case 6:
		case 7:
			tmp = "Week-end";
			break; // Si pas de break va directement passer au suivant
		default:
			tmp = "Autre jour";
		}
		return tmp;
	}

	static String jourSemaine2(int jour) {
		String tmp = null;

		switch (jour) {
		/*
		 * default: return "autre jour"; peut être mis ici
		 */
		case 1:
			return "lundi";
		case 2:
			return "mardi";
		case 3:
			return "mercredi";
		case 6:
		case 7:
			return "Week-end";
		default:
			return "autre jour";
		}
	}

	static boolean even(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	static boolean even2(int value) {
		// return value%2==0?true:false;
		return value % 2 == 0; // Déjà typé pas besoin d'en faire plus
	}

	static boolean interval(int valeur, int borneInf, int borneSup) {
		return borneInf < valeur && valeur > borneSup;
	}

	static void calculatrice(char operateur, double val1, double val2) {
		switch (operateur) {
		case '+':
			System.out.println(val1 + val2);
			break;
		case '-':
			System.out.println(val1 - val2);
			break;
		case '*':
			System.out.println(val1 * val2);
			break;
		case '/':
			if (val2 < Double.MIN_VALUE && val2 > -Double.MIN_VALUE) { // MIN_VALUE est toujours positif
				System.out.println("division par 0");
			} else {
				System.out.println(val1 / val2);
			}
			break;
		default:
			System.out.println("Opérateur invalide");
		}
	}

	// TEST WHILE
	static int tstWhile(int i) {
		int j = 0, somme = 0;
		while (j <= i) {
			somme += j;
			j++;
			System.out.println(j);
		}
		return somme;
	}

	static int tstDoWhile(int i) {
		int j = 0, somme = 0;
		do {
			somme = somme + j;
			j++;
		} while (j <= i);

		return somme;
	}

	static void tableMult(int i) {
		if (i > 0 && i <= 9) {
			int j = 0;
			while (j <= 10) {
				System.out.println(i + " " + "X" + " " + j + " " + "=" + " " + i * j);
				j++;
			}
		}
	}

	static int factoriel(int val) {
		int fact = 1;
		for (int i = 1; i <= val; i++) {
			fact *= i;
		}
		return fact;
	}

	static int factorielRecursif(int n) { // A éviter
		if (n == 0) {
			return 1;
		}
		return factorielRecursif(n - 1) * n;
		// Ici la sortie de la fonction sera quand n == 0
	}

	static void tstBreak() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // On sort de la boucle
			}
		}
	}

	static void tstContinue() {
		for (int i = 0; i < 9; i++) {
			if (i == 3) {
				continue; // On passe à la prochaine itération
			}
			System.out.println(i);
		}
	}

	static void tstLabel() {
		LOOP1: for (int i = 0; i < 3; i++) {
			for (int j = 0; i < 9; j++) {
				System.out.println( "Value of i, j: " + i + " " + j);
				if (j == 3) {
					break LOOP1; // sort de LOOP1
				}

			}
		}
	}
}
