package com.clouway.task1;
import java.util.Random;

/**
 * Stefan.Dimitrov
 */
public class StringGenerator {

    public StringGenerator(){

    }

    /**
     * Generates a random string from printable ascii characters
     * @param length specifies the number of characters the string should have
     * @return the generated string
     */
    public static String randString(int length){
        Random rndGen = new Random();
        StringBuffer strBuff = new StringBuffer(length);

        for(int i=0; i<length; i++){
            int asciiChar;
            asciiChar = 33 + rndGen.nextInt(93);
            strBuff.append((char)asciiChar);
        }

        return strBuff.toString();
    }
}
