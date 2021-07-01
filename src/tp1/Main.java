package tp1;
/*
 *   Created by Corentin on 17/03/2020 at 09:50
 */

public class Main {

    public static void main(String[] args) {
        Indien indien = new Indien("Ralf", 2);
        Cowboy jp = new Cowboy("JP");

        indien.sePresenter();
        indien.scalper(jp);
        indien.sePresenter();
    }

    //Question 1.7
    //Celle de sherif
    //Non sauf si on cast

}
