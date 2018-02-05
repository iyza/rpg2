/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public abstract class Magicien extends Personnage{

    protected int magie;
    protected Sort sorts[] = new Sort[2];

    public void magicien() {
        setHP(60);
        setDefense(1);
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }

    public Sort[] getSorts() {
        return sorts;
    }

    public void setSorts(Sort[] sorts) {
        this.sorts = sorts;
    }

    public void attaquer(Personnage personnage) {
        int coinFlip = (int)(Math.random()*2);
        if (getMagie() >= getSorts()[coinFlip].getCout()) {
            setMagie(getMagie()-getSorts()[coinFlip].getCout());
            System.out.println(getNom() + " lance le sort : " + getSorts()[coinFlip].getNomDuSort() + " et il perd " + getSorts()[coinFlip].getCout());
            magie = magie - getSorts()[coinFlip].getCout();
            System.out.println("Il lui reste " + magie + " magie.");
            getSorts()[coinFlip].lancerSort(personnage);
        }
        else {
            System.out.println(getNom() + " n'a pas assez de magie pour lancer le sort : " + getSorts()[coinFlip].getNomDuSort() + "!");
        }
    }
}
