import java.util.Date;

public class Operatos {

	public static void main(String[] args) {
		// Opérateurs mathématiques
		int i = 23;
		int j = 34;
		int rs = i + j;
		System.out.println(rs);

		int ii = 25;
		int div = ii / 2;
		int mod = ii % 2;
		System.out.println("résultat de la division:" + div + "le reste: " + mod);
		double ddiv = ii / 2; // Ici on aura pas 12,5 mais 12, car 2 était un entier.
		System.out.println(ddiv); // Pour avoir une juste division, il faut une littérale double
		ddiv = ii / 2.0;
		System.out.println(ddiv); // Do the stuff!
		
		// Opérateurs d'incrémentation / décrémentation
		i = 0;
		System.out.println(++i); // Pré-incrémentation
		i = 0;
		System.out.println(i++); // Post-incrémentation
		System.out.println(i);
		
		// Opérateur d'affectation
		i = ii;
		System.out.println(i);
		i += 23; // i = i + 23
		System.out.println(i);

		// Opérateur de comparaison
		System.out.println(i == 0);
		boolean tst = i <100;
		System.out.println(tst);
		
		// Opérateurs court-circuit
		int val1 = 10, val2 = 32;
		boolean tst2 = val1 == 1 && val2 ==  32;
		// Ici va évaluer le 1er, va être faux.
		// Dès lors il ne fera pas le test sur la seconde partie du code
		String str = null;
		// str.toUpperCase();
		boolean tst3 = str!= null && str.equals("azerty");
		System.out.println(tst + " " + tst2 + " " + tst3);
		
		boolean tst4 = val1 == 10 || val2 == 20;
		System.out.println(tst4);
		
		// Opérateurs binaires
		int valb1 = 0b100;
		int valb2 = 0b101;
		System.out.println(Integer.toBinaryString(~valb1));
		System.out.println(Integer.toBinaryString(valb1&valb2));
		System.out.println(Integer.toBinaryString(valb1^valb2));
		System.out.println(valb1>>1);
		
		// Opérateur instance off
		String st = new String("AZErTY");
		boolean tsti = str instanceof String;
		Date date = new Date();
		boolean tsti2 = (Object)date instanceof String;
		System.out.println(tsti);
		System.out.println(tsti2);

		// Promotion numérique
		// La promotion numérique permet de rendre compatible le type
		// des opérandes avant qu'une opération arithmétique ne soit effectué

		int pri = 1;
		short prs = 2;
		// En cas d'addition entre les deux le short sera converti en int
		int resPI = pri + prs;
		System.out.println(resPI);
		double prd = 2.0;
		double resD = pri * prd;
		// La veleur pri va etre convertie en valeur double
		System.out.println(resD);
		
		byte b1 = 1;
		byte b2 = 2;
		int rb = b1 + b2; // non: byte rb = b1 + b2;
		System.out.println(rb);
	}

}
