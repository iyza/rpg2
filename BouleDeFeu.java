/**
 * Created by BajLu1731402 on 05/02/2018.
 */
public class BouleDeFeu extends Sort{
    public void bouleDeFeu() {
        setDmg(5);
        setCout(5);
        setNomDuSort("Boule de Feu");
    }
    public void lancerSort(Personnage personnage) {
        personnage.setHP(personnage.getHP()-dmg);
    }
}
