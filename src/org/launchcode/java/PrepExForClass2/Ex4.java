package org.launchcode.java.PrepExForClass2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Edward Dupre on 3/1/17.
 * HashMap: Make a program similar to GradebookHashMap, but which takes in students names and ID numbers (as integers)
 * instead of names and grades. In this case, however, the keys should be integers (the IDs) and the values should be
 * strings (the names). Modify the roster printing code accordingly.
*/
public class Ex4 {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<Integer, String>();
        Scanner in = new Scanner(System.in);
        Integer newStudentID = 0;
        String newStudentName = "";

        System.out.println("Enter your students (or ENTER to finish):");
        // Get student ID and names
//        do {
//            System.out.print("StudentID: ");
//            newStudentID = in.nextInt();
//
//            if (!in.hasNextInt()){
//                System.out.println("Enter a positive integer for StudentID: ");
//                newStudentID = in.nextInt();
//            }
//            if (in.hasNextInt()) {
//                newStudentID = in.nextInt();
//                System.out.println("You entered StudentID == " + newStudentID);
//            }
//
//            System.out.print("Student Name: ");
//            if (!in.hasNext()){
//                System.out.println("Enter a Student Name: ");
//                in.next();
//            }
//            newStudentName = in.nextLine();
//            if (in.hasNextLine()) {
//                newStudentName = in.nextLine();
//                System.out.println("You entered Student Name == " + newStudentName);
//            }
//            students.put(newStudentID, newStudentName);
//            System.out.println("Student you entered " + newStudentID + ":" + newStudentName);
//        } while (newStudentID > 0);

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}
