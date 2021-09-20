package Projekt;

import java.util.Random;

public class Dice {

    int faceValue;

    public void roll(){
        Random roll = new Random();
        faceValue = roll.nextInt(6) + 1;
    }

    public int getFaceValue(){
        return faceValue;
    }



}
