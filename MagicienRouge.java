/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class MagicienRouge extends Magicien {

    public MagicienRouge() {
        setMagie(40);
        setNom("Magicien Rouge");
        getSorts()[0] = new Empoisonnement();
        getSorts()[1] = new MortSubite();
    }
}
