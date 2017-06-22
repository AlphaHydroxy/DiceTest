package example.codeclan.com.dicetester;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/06/2017.
 */

public class Gametest {
    Game game;
    Rollable dice;

    @Before
    public void before(){
        dice = new Dice(6);
        game = new Game(dice);
    }

    @Test
    public void testTakeTurn(){
        boolean result = game.nextTurn();
        assertEquals(true, result);
    }


}
