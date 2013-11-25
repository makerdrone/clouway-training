package task_introduction;

import java.util.Random;

public class StringGenerator {
    /**
     * Generate a random string with length len.
     * @param len	length of generated string
     * @return  generated string
     */
    public String randString(int len) {
        StringBuilder letters = new StringBuilder(len);
        Random randGen = new Random();

        for(int i=0; i<len; i++){
            // Append an ASCII symbol in the range 32 to 127
            letters.append((char)(32 + randGen.nextInt(95)));
        }

        return letters.toString();
    }
}
