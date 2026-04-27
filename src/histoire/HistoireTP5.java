package histoire;
import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {
	public static void main (String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		System.out.print("\n");
		
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		
		System.out.print("\n");
		
		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
		System.out.print("\n");
		
		GrandMere grandmere = new GrandMere("Grand-Mère", 10);
		grandmere.faireConnaissanceAvec(akimoto);
		grandmere.faireConnaissanceAvec(yaku);
		grandmere.faireConnaissanceAvec(masako);
		grandmere.faireConnaissanceAvec(kumi);
		grandmere.faireConnaissanceAvec(marco);
		grandmere.faireConnaissanceAvec(chonin);
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
		grandmere.ragoter();
	}
}
