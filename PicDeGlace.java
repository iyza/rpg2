/**
 * Created by BajLu1731402 on 05/02/2018.
 */
public class PicDeGlace extends Sort{
    public PicDeGlace() {
        setDmg(7);
        setCout(5);
        setNomDuSort("Pic de Glace");
    }
    public void lancerSort(Personnage personnage) {
        personnage.setHP(personnage.getHP()-(dmg-personnage.getDefense()));
    }
}
