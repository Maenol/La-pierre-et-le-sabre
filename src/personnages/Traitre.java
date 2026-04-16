package personnages;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise = 0;

	public Traitre(String nom, String boisson, int argent, String seigneur) {
		super(nom, boisson, argent, seigneur);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise +". Chut !");
	}
	
	public void ranconner (Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentRanconner = commercant.getArgent() * (2/10);
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.niveauTraitrise += 1;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom() +".");
		} else {
			parler("Mince je ne peux plus rançonner personne ou sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil () {
		if (nbConnaissances <1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			Random rand = new Random();
			Humain ami;
			ami = memoire[rand.nextInt(nbConnaissances)];
			int don = this.getArgent()*(1/20);
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec" + ami.getNom() + ".");
			parler ("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			this.perdreArgent(don);
			ami.gagnerArgent(don);
			ami.parler("Merci " + this.getNom() + " . Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise -= 1;
			}
		}
	}
}
