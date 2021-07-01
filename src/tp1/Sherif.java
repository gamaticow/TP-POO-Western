package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 10:43
 */

public class Sherif extends Cowboy {

    private int brigandCaptures = 0;

    public Sherif(String nom) {
        super(nom, "honnête");
    }

    public void coffrer(HorsLaLoi brigand){
        brigandCaptures++;
        parler("Au nom de la loi, je vous arrête !");
        brigand.seFaireEmprisonner(this);
    }

    public void rechercher(HorsLaLoi brigand){
        System.out.println("OYEZ OYEZ BRAVE GENS !! "+ brigand.recompenseSiCapture() +" $ à qui arrêtera "+ brigand.quelEstTonNom() +" le brigand mort ou vif !!");
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        parler("J'ai déja capturé " + brigandCaptures + " brigands !");
    }
}
