package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissances = 0;
	protected Humain[] memoire = new Humain [30];
	
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
	
	public void setArgent(int argent) {
		this.argent = argent;
	}

	protected void parler (String texte) {
		System.out.println("(" + this.nom + ") - " + texte);
	}
	
	public void direBonjour () {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ".");
	}
	
	public void boire () {
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	protected void gagnerArgent (int gain) {
		int nouveauMontant;
		nouveauMontant = this.argent + gain;
		this.argent = nouveauMontant;
	}
	
	protected void perdreArgent (int perte) {
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
	
	private void memoriser (Humain humain) {
		if (this.nbConnaissances >= 30) {
			for (int i = 0; i < (nbConnaissances - 1); i++ ) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[nbConnaissances - 1] = humain;
		} else {
			this.memoire[nbConnaissances] = humain;
			nbConnaissances += 1;
		}
	}
	
	private void repondre (Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void faireConnaissanceAvec (Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
	
	public void listerConnaissance () {
		String texte;
		Humain humain;
		if (nbConnaissances == 0) {
			texte = " Je ne connais personne.";
		} else {
			texte = "Je connais beaucoup de monde dont : ";
			for (int i = 0; i < nbConnaissances; i++) {
				humain = this.memoire[i];
				if (i != 0) {
					texte += ", ";
				}
				texte += humain.getNom();
			}
		}
		this.parler(texte);
	}
}
