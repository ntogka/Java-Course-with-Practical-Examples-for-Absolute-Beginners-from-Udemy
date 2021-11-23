package intermediate.classesandobjects;

public class BasketbalApp {

    public static void main(String[] args) {

        BasketbalPlayer kobe = new BasketbalPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BasketbalPlayer jordan = new BasketbalPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketbalPlayer magic = new BasketbalPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BasketbalPlayer[] basketbalPlayers = new BasketbalPlayer[3];
        basketbalPlayers[0] = kobe;
        basketbalPlayers[1] = jordan;
        basketbalPlayers[2] = magic;

        for (BasketbalPlayer basketbalPlayer : basketbalPlayers) {
            basketbalPlayer.freeThrow();
        }
    }

}
