package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 09:44
 */

public class Humain {

    private String nom;
    private String boissonFavorite;

    public Humain(String nom) {
        this(nom, "eau");
    }

    public Humain(String nom, String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }

    public void parler(String texte){
        System.out.println("("+nom+") - " + texte);
    }

    public void sePresenter(){
        parler("Bonjour je m'appelle "+nom+" et j'adore "+ boissonFavorite);
    }

    public void boire(){
        parler("Ah ! un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public String quelEstTonNom(){
        return nom;
    }

    public String quelEstTaBoisonFavorite(){
        return boissonFavorite;
    }

}
