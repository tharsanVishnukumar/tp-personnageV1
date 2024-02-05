import java.util.Random;

import Personnage.*;

public class Main {
    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String args[]) {

        Personnage perso1 = new Personnage("Magicien", getRandomInt(50, 100));
        Personnage perso2 = new Personnage("Sorcier", getRandomInt(50, 100));

        while (!perso1.estMort() && !perso2.estMort()) {
            int randomint = getRandomInt(0, 1);
            int dommage = getRandomInt(20, 80);
            System.out.println("La vie du " + perso1.LeNom() + " est " + perso1.LaVie());
            System.out.println("La vie du " + perso2.LeNom() + " est " + perso2.LaVie());

            if (randomint == 0) {
                perso1.Attaque(perso2, dommage);
                System.out.println("le " + perso2.LeNom() + "a subit " + dommage + " dégat");
            } else {
                perso2.Attaque(perso1, dommage);
                System.out.println("le " + perso1.LeNom() + "a subit " + dommage + " dégat");
            }
        }
        if (perso1.estMort()) {
            perso1.messageDeMort();
        }
        if (perso2.estMort()) {
            perso2.messageDeMort();
        }

    }
}
