package personnages;
import java.util.Random;

public class GrandMere extends Humain {
	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	@Override
	protected void memoriser (Humain humain) {
		if (this.nbConnaissances < 5) {
			super.memoriser(humain);
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	private enum TypeHumain {
		COMMERCANT("un commercant"),
	    RONIN("un ronin"),
	    SAMOURAI("un samourai"),
	    HABITANT("un habitant"),
		GRANDMERE("une grand-mère");

	    private String nom;

	    TypeHumain(String nom) {
	        this.nom = nom;
	    }

	    public String getNom() {
	        return nom;
	    }
	}
	private String humainHasard () {
	    TypeHumain[] types = TypeHumain.values();
	    Random random = new Random();
	    int index = random.nextInt(types.length);
	    return types[index].getNom();
	}
	
	public void ragoter () {
		Random random = new Random();
		int index = random.nextInt(this.nbConnaissances);
		Humain humain = this.memoire[index];
		if (humain instanceof Traitre) {
			parler("Je sais que " + humain.getNom() + " est un traître. Petit chenapan !");
		} else {
			parler("Je crois que " + humain.getNom() + " est " + humainHasard() + ".");
		}
	}

}
