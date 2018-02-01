/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public abstract class Personnage {

    protected int HP;
    protected int defense;
    protected String nom;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void attaquer(Personnage personnage);

}
