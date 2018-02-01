/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public abstract class Magicien extends Personnage{

    protected int magie;
    protected Sort sorts[] = new Sort[2];

    public void magicien(int HP, int defense) {
        this.HP = 60;
        this.defense = 1;
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

    public abstract void lancerSort();

    public void attaquer(Personnage personnage) {

    }
}
