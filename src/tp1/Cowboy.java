package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 09:54
 */

public class Cowboy extends Humain implements VisagePale {

    private int popularite = 0;
    private String adjectif;

    public Cowboy(String nom) {
        this(nom, "vaillant");
    }

    public Cowboy(String nom, String adjectif) {
        super(nom, "whisky");
        this.adjectif = adjectif;
    }

    public void tirer(HorsLaLoi brigand){
        System.out.println("Le "+adjectif+" "+this.quelEstTonNom()+" tire sur "+ brigand.quelEstTonNom() +". PAN !");
        parler("Prend ça, rascal !");
    }

    public void liberer(Dame dame){
        popularite++;
        parler("Je suis la pour vous liberer " + dame.quelEstTonNom());
        dame.seFaireLiberer(this);
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("Je suis très " + adjectif);
        parler("Je suis très populaire, j'ai " + popularite + " de popularité");
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }

}
