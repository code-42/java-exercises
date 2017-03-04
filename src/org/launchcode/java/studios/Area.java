package org.launchcode.java.studios;
import java.util.Scanner;
/**
 * Created by melocal on 2/28/17.
 */
public class Area {
    public static void main(String[] args) {
        double PI = 3.14;
        double r;
        double area;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter a positve number for radius: ");
            while (!in.hasNextDouble()){
                System.out.println("Enter a positive number for radius: ");
                in.next();
            }
        r = in.nextDouble();
        } while (r <= 0);

        area = PI * r * r;
        System.out.println("The radius of a circle of radius " + r + "is: " + area);
    }

}
