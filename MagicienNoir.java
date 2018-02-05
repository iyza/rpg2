/**
 * Created by BajLu1731402 on 01/02/2018.
 */
public class MagicienNoir extends Magicien {

    public void magicienNoir() {
        setMagie(50);
        setNom("Magicien Noir");
        getSorts()[0] = new BouleDeFeu();
        getSorts()[1] = new PicDeGlace();
    }
}
