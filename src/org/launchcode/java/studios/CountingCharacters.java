package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Edward Dupre on 3/2/17.
 * Write a program that calculates the number of times each character
 * occurs in a string and prints these counts to the console.
 */
public class CountingCharacters {

    public static void main(String[] args) {
        //
        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> charMap;
        charMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for(char chars : strArray){
            if(charMap.containsKey(chars)){
                charMap.put(chars, charMap.get(chars)+1);
            } else {
                charMap.put(chars, 1);
            }
        }
        for(Map.Entry<Character, Integer> chr : charMap.entrySet()){
            System.out.println(chr.getKey() + ": " + chr.getValue());
        }

        // Bonus Mission
        // Make the counts case-insensitive
        HashMap<Character, Integer> charMap_lc = new HashMap<Character, Integer>();
        char[] strArray_lc = inputString.toLowerCase().toCharArray();
        System.out.print("\nBonus Mission: Make the counts case-insensitive\n");
        for(char chars : strArray_lc){
            if(charMap_lc.containsKey(chars)){
                charMap_lc.put(chars, charMap_lc.get(chars)+1);
            } else {
                charMap_lc.put(chars, 1);
            }
        }
        for(Map.Entry<Character, Integer> chr : charMap_lc.entrySet()){
            System.out.println(chr.getKey() + ": " + chr.getValue());
        }

        // Bonus Mission
        // Exclude non-alphabetic characters
        HashMap<Character, Integer> charMap_x = new HashMap<Character, Integer>();
        char[] strArray_x = inputString.toCharArray();
        System.out.print("\nBonus Mission: Exclude non-alphabetic characters\n");
        for(char chars : strArray_x) {
            if (Character.isAlphabetic(chars)) {
                if (charMap_x.containsKey(chars)) {
                    charMap_x.put(chars, charMap_x.get(chars) + 1);
                } else {
                    charMap_x.put(chars, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> chr : charMap_x.entrySet()) {
            System.out.println(chr.getKey() + ": " + chr.getValue());
        }

        // Bonus Mission
        // Get the string as input from the user at the command line
        HashMap<Character, Integer> charMap_kb = new HashMap<>();
        System.out.print("\nBonus Mission: Get the string as input from the user at the command line\n");
        Scanner in = new Scanner(System.in);
        String kb_in;
        System.out.print("Enter some text for counting: ");
        kb_in = in.nextLine();
        if (!kb_in.equals("")) {
            char[] strArray_kb = kb_in.toCharArray();
            for(char chars : strArray_kb){
                if(charMap_kb.containsKey(chars)){
                    charMap_kb.put(chars, charMap_kb.get(chars)+1);
                } else {
                    charMap_kb.put(chars, 1);
                }
            }

            for(Map.Entry<Character, Integer> chr : charMap_kb.entrySet()){
                System.out.println(chr.getKey() + ": " + chr.getValue());
            }

        }
    }
}

