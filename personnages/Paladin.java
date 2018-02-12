package personnages;

import armes.Tranchant;

/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class Paladin extends Guerrier{

    private Tranchant arme;

    public Paladin(Tranchant arme) {
        setHP(80);
        setDefense(5);
        setForce(5);
        setNom("Paladin");
        this.arme = arme;
    }

    public int ajouteForce() {
        return arme.trancher();
    }
}
