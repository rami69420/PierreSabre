package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		// Création du personnage "Prof" qui aime le kombucha et a 54 sous
		Humain prof = new Humain("Prof", "kombucha", 54);

		// Le "Prof" se présente
		prof.direBonjour();
		// Affichage de l'argent initial
		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous");
		// Le "Prof" boit son kombucha
		prof.boire();
		// Le "Prof" achète une boisson à 12 sous
		prof.acheter("boisson", 12);
		// Affichage de l'argent après l'achat
		System.out.println(
				"(Prof) - J'ai " + prof.getArgent() + " sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous");
		// Le "Prof" achète un jeu à 2 sous
		prof.acheter("jeu", 2);
		// Le "Prof" constate qu'il ne peut acheter un kimono à 50 sous
		System.out.println("(Prof) - Je n'ai plus que " + prof.getArgent()
				+ " sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.");
	}
}
