package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.boire();
		prof.acheter("boisson", 12);
		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		prof.acheter("jeu", 2);
		System.out.println("(Prof) - Je n'ai plus que " + prof.getArgent()
				+ " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");
		

		
        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        marco.seFaireExtorquer();
        System.out.println("(Marco) - J’ai tout perdu! Le monde est trop injuste...");
        marco.recevoir(15);
        System.out.println("(Marco) - 15 sous ! Je te remercie généreux donateur!");
        marco.boire();
        
        

        
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "whisky", "Warsong");
        yakuLeNoir.direBonjour();
        System.out.println("(Yaku Le Noir) - Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        System.out.println("(Yaku Le Noir) - Marco, si tu tiens à la vie donne moi ta bourse !");
        yakuLeNoir.extorquer(marco);
        
        
        Ronin roronoa = new Ronin("Roronoa", 60, "shochu");
        roronoa.direBonjour();
        roronoa.donner(marco);
        System.out.println("(Marco) - Je te remercie généreux donateur!");
	}
}
