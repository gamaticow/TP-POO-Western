package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 10:31
 */

public class Barmen extends Humain implements VisagePale {

    private String nomDuBar;

    public Barmen(String nom, String nomDuBar) {
        super(nom, "vin");
        this.nomDuBar = nomDuBar;
    }

    public Barmen(String nom){
        this(nom, "Chez " + nom);
    }

    public void servirUnVerre(Humain humain){
        humain.boire();
    }

    @Override
    public void parler(String texte) {
        super.parler(texte + " Coco.");
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("Mon super bar est " + nomDuBar);
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
