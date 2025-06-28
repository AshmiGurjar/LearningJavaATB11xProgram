package ex_14_Exceptions;

import java.util.Scanner;

public class Lab069_HandlingException {
    public static void main(String[] args) {
        System.out.println("Prog started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        try {
            System.out.println(100/num);
        }
        catch (ArithmeticException e){
            System.out.println("Invalid Data");
        }

        System.out.println("Prog finished");
        System.out.println("Prog completed");
    }
}
