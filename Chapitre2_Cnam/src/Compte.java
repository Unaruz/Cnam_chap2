class Compte {
	int solde;
	String titulaire;
	int age;
	
	void afficherSolde() {
		System.out.println("solde : " + this.solde);
	}
	
	void deposer(int montant) {
		this.solde = this.solde + montant;
	}
	
	void retirer(int montant) {
		this.solde = this.solde - montant;
	}
}
