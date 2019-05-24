import java.util.Date;

public class DataType {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// Déclaration
		int largeur;

		// Initialisation
		largeur = 42;

		System.out.println(largeur);

		int longueur = 100;
		System.out.println(longueur);

		// Déclaration de plusieurs variables (multiples)
		int i, j, k = 2;
		i = 0;
		j = 1;
		System.out.println(i + " " + j + " " + k);

		double d = 4.12, d2 = 4e1;
		// 4e1 4 exponentiel 1
		System.out.println(d + " " + d2);

		char ch = 'z';
		System.out.println(ch);

		boolean tst = true;
		System.out.println(tst);

		long l = 1200000000000L;
		// L indique que c'est un littéral
		float f = 1.2f;
		// f indique que flottant
		System.out.println(l + " " + f);

		// Littéral changement de base
		int hex = 0xFF;
		int bin = 0b1111;
		int oct = 077;
		System.out.println(hex + " " + bin + " " + oct);

		// littéral séparateur : donne de la lisibilité au code
		double sep = 1_000.0;
		// Le séparateur ne peut ête en début, fin, après la virgule
		System.out.println(sep);

		// Transtypage implicite
		byte bt = 12;
		int it = bt;
		double dt = it;
		System.out.println(bt + " " + it + " " + dt);

		// Possible perte de précision
		long l1 = 123456789L;
		long l2 = 123456788L;
		float ft1 = l1;
		float ft2 = l2;
		long lt1 = l2 - l1;
		float ftt = ft2 - ft1;
		System.out.println(lt1 + " " + ftt);
		
		// Transtypage explicite : indique à java qu'on prend la responsabilité de convertir la valeur
		int ite = 1;
		byte bte = (byte)ite;
		System.out.println(bte);// Il faut faire attention au dépassement de capacité
		ite = 6015;
		bte=(byte)ite;
		System.out.println(bte); // Ici le découpage ne sera pas bon
		// Attention au domaine de définition de la variable
		
		// Type Référence
		String str1= new String("Bonjour");
		String str2= null;
		System.out.println(str1 + " " + str2);
		str2 = str1; // va pointer vers le même objet
		System.out.println(str2);
		Date date = new Date();
		System.out.println(date);
		// Un type référence peut être null ou encore appeler une méthode d'objet
		
		System.out.println(str1.toUpperCase());
		
		// Type Enveloppe
		Integer iw = new Integer(255);
		System.out.println(iw);
		System.out.println(Integer.parseInt("12345")); // chaine de charactère vers un type primitif
		System.out.println(Integer.valueOf("12345")); // chaine de charactère vers un objet Integer
		System.out.println(Integer.toHexString(iw));
	}

}
