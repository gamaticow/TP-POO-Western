package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 11:17
 */

public class Indien extends Humain {

    private int plume;
    private String totem;

    public Indien(String nom, int plume, String totem) {
        super(nom, "jus de racine");
        this.plume = plume;
        this.totem = totem;
    }

    public Indien(String nom, int plume) {
        this(nom, plume, "Coyote");
    }

    public void scalper(VisagePale visagePale){
        plume++;
        visagePale.scalp();
    }

    @Override
    public void parler(String texte) {
        super.parler(texte + " Ugh !");
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("Mon totem est " + totem + " et j'ai " + plume + " plumes");
    }
}
