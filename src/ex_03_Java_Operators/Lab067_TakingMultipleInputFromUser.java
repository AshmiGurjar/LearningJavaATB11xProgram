package ex_03_Java_Operators;

import java.util.Scanner;

public class Lab067_TakingMultipleInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Your name is:"+name);

        System.out.println("Enter the age:");
        String age = sc.next();
        System.out.println("Your age is:"+age);

        System.out.println("Enter Unknown Value:");
        Object value=sc.next();
        System.out.println("Added unknown value is" +value);

    }
}
