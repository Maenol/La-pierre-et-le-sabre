package personnages;

public class Samourai extends Ronin {
	private String seigneur;

	public Samourai(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + this.seigneur + ".");
	}
	
	public void boire (String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je prendre du " + boisson + ".");
	}
}
