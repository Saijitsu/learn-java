
public class Tableau {

	public static void main(String[] args) {
		// Tableau à une dimension
		// Déclare mon tableau
		double[] tab = new double[5];
		// Initialisation du tableau
		tab[0] = 1.1;
		tab[1] = 1.2;
		tab[2] = 1.3;
		tab[3] = 1.4;
		tab[4] = 1.5;
		for (int i = 0; i < tab.length; i++) {
			System.out.println(i + tab[i]);
		}
		// Utilisation d'un "foreach", plus rapide
		for (double v : tab) {
			System.out.println(v);
		}

		double tabInit[] = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		for(double v:tabInit) {
			System.out.println(v);
		}
		
		int[][]tab2D1 = new int[3][2];
		
		int[][]tab2D2 = new int[3][];
		tab2D2[0]= new int [2];
		tab2D2[1]= new int [2];
		tab2D2[2]= new int [2];
		
		tab2D1[0][1]=23;
		System.out.println(tab2D1[0][1]);
		
		int[][]tab2DInt = {{1,2},{3},{1,2,3,4}};
		System.out.println(tab2DInt.length); // nombre de lignes
		System.out.println(tab2DInt[0].length); // nombre de colonnes
		vararg(1,1,3);
		vararg(1);
		vararg(1,1,3,4);

		}
	

	// static void vararg(int v, int...a) // faux: un seul argument variable par méthode
	// static void vararg(int v, int a) // faux: l'argment variable est toujours le dernier argument

	static void vararg(int v, int...a) {
		System.out.println(v);
		for(int i:a) {
			System.out.println(i);
		}
	}

}
