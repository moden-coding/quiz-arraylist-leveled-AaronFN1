
/*
 * You are going to write code that is designed to store student ID numbers.
 * You will create an ArrayList for Integers, then accept user input to add values 
 * to that ArrayList. There will be additional modifications you can make:
 * 
 * B level:
 * Accept input from users, add values to an ArrayList
 * 
 * B+ level:
 * B level plus stop accepting input when the user enters -1. After this, the full
 * list of student numbers should be printed, one student ID per line.
 * 
 * A- level: 
 * Complete B and B+. Also do not allow duplicates. When the user enters a student ID 
 * that already exists, tell them they cannot add duplicates then continue accepting input 
 * as per B+ level.
 * 
 * A+ level:
 * Complete B and B+. Modify A- so that when a duplicate value is entered, the user is asked 
 * whether they want to delete the existing value. If they enter "yes", the value is removed
 * from the ArrayList. Ignore any other input and do not add the value to the ArrayList.
 * 
 * An A will be awarded for an attempt at A+ that is close but not complete.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> studentIDList = new ArrayList<>();
        System.out.println("Please input student ID numbers.");
        System.out.println("Enter '-1' to stop.");
        while (true) {
            int studentID = Integer.valueOf(scanner.nextLine());
            if (studentID == -1) {
                break;
            }
            if (studentIDList.indexOf(studentID) == -1) {
                studentIDList.add(studentID);
            } else {
                int duplicateIndex = studentIDList.indexOf(studentID);
                System.out.println("This number is a duplicate, would you also like to delete the existing number?");
                System.out.println("(Answer yes or no)");
                String tOrF = scanner.nextLine();
                if (tOrF.equals("yes") || tOrF.equals("Yes")) {
                    studentIDList.remove(duplicateIndex);
                    System.out.println("Value removed.");
                }
                else{
                    System.out.println("Value kept.");
                }
            }
        }
        System.out.println("");
        for (int studentIDs : studentIDList) {
            System.out.println(studentIDs);
        }
    }
}
