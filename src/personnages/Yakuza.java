package personnages;

public class Yakuza extends Humain {
	private  String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer (Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int montantVole;
		montantVole = victime.seFaireExtorquer();
		int gain;
		gain = this.getArgent() + montantVole;
		this.setArgent(gain);
		parler("J'ai piqué les " + montantVole + " sous de " + victime.getNom() + ", ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi!");
	}
	
	public int perdre () {
		int perte;
		perte = this.getArgent();
		this.setArgent(0);
		this.reputation -= 1;
		parler("Jai perdu mon duel et mes " + perte + " sous, snif... J'ai déshonoré le clan de " + this.clan);
		return perte;
	}
	
	public void gagner (int gain) {
		int montantTotal;
		montantTotal = this.getArgent() + gain;
		this.setArgent(montantTotal);
		parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	@Override
	public void direBonjour () {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.clan + ".");
	}
}
