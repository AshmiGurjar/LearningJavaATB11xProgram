package ex_03_Java_Operators;

import java.util.Scanner;

public class Lab066_TakingInputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer value:");
        int num = sc.nextInt();
        System.out.println("Given Number is: " +num);

        System.out.println("Enter the Floating value:");
        float f = sc.nextFloat();
        System.out.println("Given Number is: " +f);



    }
}
