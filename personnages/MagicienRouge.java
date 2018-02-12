package personnages;

import armes.Magique;
import sorts.Empoisonnement;
import sorts.MortSubite;

/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class MagicienRouge extends Magicien {

    public MagicienRouge(Magique arme) {
        super();
        setMagie(40);
        setNom("Magicien Rouge");
        getSorts()[0] = new Empoisonnement();
        getSorts()[1] = new MortSubite();
        this.arme = arme;
    }

    public int ajouteForce() {
        return arme.lancerUnSort();
    }
}
