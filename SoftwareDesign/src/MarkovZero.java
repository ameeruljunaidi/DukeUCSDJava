/**
 * Write a description of class MarkovZero here.
 *
 * @author Duke Software
 * @version 1.0
 */

import java.util.Random;

public class MarkovZero extends AbstractMarkovModel {
    private String myText;
    private Random myRandom;

    public MarkovZero() {
        myRandom = new Random();
    }

    public void setRandom(int seed) {
        myRandom = new Random(seed);
    }

    public void setTraining(String s) {
        myText = s.trim();
    }

    /**
     * Returns random text that is numChars long
     * This class generates each letter by randomly choosing a letter form the training text
     *
     * @param numChars the length of the string
     * @return a string that is randomly generated
     */
    public String getRandomText(int numChars) {
        if (myText == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < numChars; k++) {
            int index = myRandom.nextInt(myText.length());
            sb.append(myText.charAt(index));
        }

        return sb.toString();
    }

    @Override public String toString() {
        return "MarkovModel of Order 0";
    }
}
