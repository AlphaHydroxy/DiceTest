package example.codeclan.com.dicetester;

import java.util.Random;

/**
 * Created by user on 22/06/2017.
 */

public class Dice implements Rollable {
    int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll(){
        return randomNumber(1, this.numberOfSides);
    }

    private int randomNumber(int min, int max){
        Random rand = new Random();
        int result = rand.nextInt((max - min) + 1) + min;
        return result;
    }
}
