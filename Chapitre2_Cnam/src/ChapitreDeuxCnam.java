
public class ChapitreDeuxCnam {

	public static void main(String[] args) {
		Compte c1 = new Compte();
		Compte c2 = new Compte();
		
		c1 = c2;
		c1.solde = 100;
		c1.deposer(300);
		System.out.println("solde c1 = " + c1.solde);
		System.out.println("solde c2 = " + c2.solde);
		
	}

}
