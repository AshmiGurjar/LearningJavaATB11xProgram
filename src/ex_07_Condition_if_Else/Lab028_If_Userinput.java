package ex_07_Condition_if_Else;

import java.util.Scanner;

public class Lab028_If_Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:-");
        int value = scanner.nextInt();

        if(value >10){
            System.out.println("Student in Higher secondary");
        }
        else {
            System.out.println("Student in Primary");
        }
    }
}
