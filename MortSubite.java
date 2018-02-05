/**
 * Created by BajLu1731402 on 05/02/2018.
 */
public class MortSubite extends Sort{
    private int coinFlip = (int)(Math.random()*10);
    public void mortSubite () {
        setDmg(9999);
        setCout(10);
        setNomDuSort("Mort Subite");
    }
    public void lancerSort(Personnage personnage) {
        if (coinFlip == 7) {
            personnage.setHP(personnage.getHP()-dmg);
        }
        else {

        }
    }
}
