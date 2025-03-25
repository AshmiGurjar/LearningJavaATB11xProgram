package Tasks;

import java.util.Scanner;

public class Task04_UserInput {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner sc = new Scanner(System.in); //Create a scanner object
        System.out.println("Enter Name: ");
        String username = sc.nextLine(); //Read user input
        System.out.println("Enter Age: ");
        String age = sc.nextLine(); //Read user input
        System.out.println("Enter Salary: ");
        String salary = sc.nextLine(); //Read user input
        System.out.println("Username is:" +username);
        System.out.println("Age is:" +age);
        System.out.println("Salary is:" +salary);
    }
}
