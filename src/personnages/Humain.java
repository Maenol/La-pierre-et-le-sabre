package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler (String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour () {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ".");
	}
	
	public void boire () {
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	private void gagnerArgent (int gain) {
		int nouveauMontant;
		nouveauMontant = this.argent + gain;
		this.argent = nouveauMontant;
	}
	
	private void perdreArgent (int perte) {
		int nouveauMontant;
		nouveauMontant = this.argent - perte;
		this.argent = nouveauMontant;
	}
	
	public void acheter (String bien, int prix) {
		if (this.argent >= prix) {
			parler("J'ai " + this.argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + this.argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		}
	}
	
}
