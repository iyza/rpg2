/**
 * Created by BajLu1731402 on 05/02/2018.
 */
public class Empoisonnement extends Sort{
    private int nbCast = 0;
    public Empoisonnement () {
        setDmg(2);
        setCout(2);
        setNomDuSort("Empoisonnement");
    }
    public void lancerSort(Personnage personnage) {
        nbCast++;
        personnage.setHP(personnage.getHP()-(dmg*nbCast));
    }
}
