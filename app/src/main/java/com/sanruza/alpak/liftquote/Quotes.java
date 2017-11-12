
package com.sanruza.alpak.liftquote;

import java.util.ArrayList;
import java.util.Random;

/**
 this is more of a random generator but i'll leave the name there
 */
public class Quotes {


    public static Random rand = new Random();


    public static int rndGen(int max, int min){

        int x;
        x = rand.nextInt((max - min) + 1)+min;
        return x;
    }

}