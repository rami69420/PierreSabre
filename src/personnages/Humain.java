package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    // Constructeur
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    // Accesseur pour le nom
    public String getNom() {
        return nom;
    }

    // Accesseur pour l'argent
    public int getArgent() {
        return argent;
    }

    // Méthode pour dire bonjour
    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    // Méthode pour boire
    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    // Méthode pour s'acheter un bien
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            argent -= prix; // Diminue l'argent du coût du bien
            parler("J'ai acheté un(e) " + bien + " pour " + prix + " sous.");
        } else {
            parler("Je n'ai pas assez d'argent pour acheter ce(tte) " + bien + "...");
        }
    }

    // Méthode pour gagner de l'argent
    private void gagnerArgent(int gain) {
        argent += gain;
        parler("J'ai gagné " + gain + " sous !");
    }

    // Méthode pour perdre de l'argent
    private void perdreArgent(int perte) {
        argent -= perte;
        parler("J'ai perdu " + perte + " sous...");
    }

    // Méthode pour faire parler un Humain
    private void parler(String texte) {
        System.out.println(texte);
    }
}
