package org.launchcode.java.PrepExForClass2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by melocal on 2/28/17.
 * ArrayList: Write a static method to find the sum of all the even numbers in a list.
 * Within main, create a list with at least 10 integers and call your method on the list.
 */
public class Ex1 {
    public static void main(String[] args) {
        int sum = 0;
        int input = 0;
        ArrayList<Integer> arryList = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Enter a positve integer for summing: ");
            while (!in.hasNextInt()){
                System.out.println("Enter a positive integer: ");
                in.next();
            }
            input = in.nextInt();
        } while (input <= 0);

        // input = in.nextInt();
        for(int i = 0; i <= input; i++){
            if (i % 2 == 0) {
                arryList.add(i);
            }
        }

        for(int a : arryList){
            sum = sum + a;
        }
        System.out.println("sum == " + sum);

        for (Integer arr : arryList) {
            System.out.println("arr == " + arr);
        }

        for(int a : arryList){
            System.out.println("a == " + a);
        }

        for(int i = 0; i < arryList.size(); i++){
            System.out.println("i == " + i);
        }
    }
}
