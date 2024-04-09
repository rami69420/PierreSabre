package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	// Constructeur
	public Yakuza(String nom, int argent, String boissonFavorite, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		this.reputation = 0; // La réputation est initialisée à 0 par défaut
	}

	// Méthode pour extorquer un commerçant
	public void extorquer(Commercant victime) {
		int montantExtorque = victime.seFaireExtorquer();
		setArgent(getArgent() + montantExtorque); // Ajoute l'argent extorqué au Yakuza
		reputation++; // Augmente la réputation du Yakuza
		parler("J’ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");
	}
}
