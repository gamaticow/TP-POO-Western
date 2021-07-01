package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 09:55
 */

public class Brigand extends Humain implements HorsLaLoi, VisagePale {

    private String look = "méchant";
    private int dameEnlevees = 0;
    private int bounty = 100;
    private boolean prison = false;

    public Brigand(String nom) {
        super(nom, "tord-boyaux");
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

    @Override
    public String quelEstTonNom(){
        return super.quelEstTonNom() + " le " + look;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("J'ai l'air " + look + " et j'ai déjà kidnappé " + dameEnlevees + " dames !");
        parler("Ma tête est mise a prix " + bounty + " $ !");
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}
