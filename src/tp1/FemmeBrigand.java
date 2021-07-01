package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 11:15
 */

public class FemmeBrigand extends Dame implements HorsLaLoi {

    private int dameEnlevees = 0;
    private int bounty = 100;
    private boolean prison = false;

    public FemmeBrigand(String nom, String couleurRobe) {
        super(nom, couleurRobe);
    }

    @Override
    public void kidnapper(Dame dame){
        dameEnlevees++;
        parler("Ah ah ! "+ dame.quelEstTonNom() +", tu es mienne desormais !");
        dame.seFaireKidnapper(this);
    }

    @Override
    public void seFaireEmprisonner(Cowboy cowboy){
        prison = true;
        parler("Damned, je suis fait ! "+cowboy.quelEstTonNom()+", tu m’as eu !");
    }

    @Override
    public int recompenseSiCapture(){
        return bounty;
    }
}
