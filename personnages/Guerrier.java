package personnages;

import armes.*;

/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public abstract class Guerrier extends Personnage {

    protected int force;

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public abstract int ajouteForce();

    @Override
    public void attaquer(Personnage personnage) {
        personnage.setHP(personnage.getHP()-(force*2-personnage.getDefense() + ajouteForce()));
        System.out.println(getNom() + " attaque pour faire " + (getForce()*2-personnage.getDefense() + ajouteForce()) + " degats!");
    }
}
