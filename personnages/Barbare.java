package personnages;

import armes.Contondant;

/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class Barbare extends Guerrier{

    private Contondant arme;

    public Barbare(Contondant arme) {
        setHP(100);
        setDefense(3);
        setForce(10);
        setNom("Barbare");
        this.arme = arme;
    }

    public int ajouteForce() {
        return arme.frapper();
    }
}
