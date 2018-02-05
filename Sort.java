/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public abstract class Sort {
    protected int dmg;
    protected int cout;
    protected String nomDuSort;

    public String getNomDuSort() {
        return nomDuSort;
    }

    public void setNomDuSort(String nomDuSort) {
        this.nomDuSort = nomDuSort;
    }

    public void lancerSort(Personnage personnage) {

    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
