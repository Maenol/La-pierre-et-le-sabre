package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main (String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		System.out.print("\n");
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.print("\n");
		
		Yakuza yaku_le_noir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku_le_noir.direBonjour();
		yaku_le_noir.extorquer(marco);
	}
}
