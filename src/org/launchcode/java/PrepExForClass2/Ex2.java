package org.launchcode.java.PrepExForClass2;
import java.util.ArrayList;

/**
 * Created by melocal on 3/1/17.
 * ArrayList and Strings:
 * Write a static method to print out each word in a list that has exactly 5 letters.
 */
public class Ex2 {
    public static void main(String[] args) {
        //

        String wordList = "ArrayList and Strings: Write a static method to print out each word in a array that has exactly 5 letters.";
        ArrayList<String> fives = new ArrayList<>();
        for(String word : wordList.split("\\s+")){
            fives.add(word);
        }
        for (String word : fives){
            if (word.length() == 5){
                System.out.println(word);
            }
        }
    }
}
