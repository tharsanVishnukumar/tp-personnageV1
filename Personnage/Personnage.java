package Personnage;

public class Personnage {
    private int vie;
    private String nom;

    public Personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    public int LaVie() {
        return this.vie;
    }

    public boolean estMort() {
        return this.vie <= 0;
    }

    public void messageDeMort() {
        System.out.println("le personage " + this.nom + "est mort");
    }

    public String LeNom() {
        return this.nom;
    }

    public void AugmenterVie(int vie_a_augment) {
        this.vie += vie_a_augment;
    }

    public void Attaque(Personnage addversere, int dommage) {
        addversere.vie -= dommage / 2;
    }
}