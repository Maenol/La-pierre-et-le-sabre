package personnages;

public class Commercant extends Humain {
	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int  seFaireExtorquer () {
		int sommeExtorquee;
		sommeExtorquee = this.getArgent();
		this.setArgent(0);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return sommeExtorquee;
	}
	
	public  void recevoir (int argent) {
		int somme;
		somme = this.getArgent() + argent;
		this.setArgent(somme);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}
}
