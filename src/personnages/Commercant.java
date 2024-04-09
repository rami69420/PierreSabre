package personnages;

public class Commercant extends Humain {
    // Constructeur
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    // Le commerçant se fait extorquer tout son argent
    public int seFaireExtorquer() {
        int montantExtorque = getArgent();
        setArgent(0); // Utilisez le setter pour mettre l'argent à 0
        parler("Le monde est vraiment trop injuste...");
        return montantExtorque;
    }

    // Le commerçant reçoit de l'argent
    public void recevoir(int argent) {
        setArgent(getArgent() + argent); // Utilisez le getter et le setter pour ajuster l'argent
    }
}
