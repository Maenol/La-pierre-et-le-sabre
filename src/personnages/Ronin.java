package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don;
		don = this.getArgent() / 10;
		this.setArgent(this.getArgent() - don);
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer (Yakuza adversaire) {
		int force;
		force = this.honneur * 2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (force >= adversaire.getReputation()) {
			int montantTotal;
			montantTotal = adversaire.perdre() + this.getArgent();
			this.setArgent(montantTotal);
			this.honneur += 1;
			parler("Je t'ai eu petit yakuza !");
		} else {
			this.honneur -= 1;
			adversaire.gagner(this.getArgent());
			this.setArgent(0);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont prit un coup.");
		}
	}
}
