package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 09:54
 */

public class Dame extends Humain implements VisagePale {

    private String couleurRobe;
    private boolean libre = true;

    public Dame(String nom, String couleurRobe) {
        super(nom, "lait");
        this.couleurRobe = couleurRobe;
    }

    public void seFaireKidnapper(HorsLaLoi brigand){
        libre = false;
        parler("A L'AIDEEEEEEEEEEEEEEEEEEEEE !");
    }

    public void seFaireLiberer(Cowboy cowboy){
        libre = true;
        parler("OH ! Merci " + cowboy.quelEstTonNom() + " de m'avoir libérer");
    }

    public void changerDeRobe(String couleurRobe){
        this.couleurRobe = couleurRobe;
        parler("Regardez ma nouvelle robe " + couleurRobe + " !");
    }

    @Override
    public String quelEstTonNom() {
        return "Miss "+ super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("J'ai une superbe robe " + couleurRobe + " !");
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
