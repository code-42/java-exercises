package org.launchcode.java.PrepExForClass2;

/**
 * Created by melocal on 3/1/17.
 * Arrays: Create and initialize an array with the following value in a single line: 1, 1, 2, 3, 5, 8.
 * Then loop through the array and print out each value.
 */
public class Ex3 {
    public static void main(String[] args) {
        int fibs[] = {1,1,2,3,5,8};
        for (int i : fibs){
            System.out.println(i);
        }
    }
}
