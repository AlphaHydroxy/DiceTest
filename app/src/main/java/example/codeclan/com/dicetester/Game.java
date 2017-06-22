package example.codeclan.com.dicetester;

/**
 * Created by user on 22/06/2017.
 */

public class Game {
    Rollable dice;

    public Game(Rollable dice) {
        this.dice = dice;
    }

    public boolean nextTurn(){
        int result = dice.roll();
        return result > 2;
    }
}
