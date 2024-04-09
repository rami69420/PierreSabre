package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	// Constructeur
	public Ronin(String nom, int argent, String boissonFavorite) {
		super(nom, boissonFavorite, argent);
	}
	
	// Méthode pour donner 10% de son argent
	public void donner(Commercant beneficiaire) {
		int don = getArgent() / 10;
		beneficiaire.recevoir(don);
		setArgent(getArgent() - don);
		parler("Marco prends ces "+ don + " sous");
	}
}
