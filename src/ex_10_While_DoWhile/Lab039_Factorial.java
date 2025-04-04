package ex_10_While_DoWhile;

import java.util.Scanner;

public class Lab039_Factorial {
    public static void main(String[] args) {
        //Factorial Loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial:");
        int num = sc.nextInt();

        int factorial=1;
        if(num <=0){
            System.out.println("Value of factorial "+factorial);
        }
        else {
            for (int i =1; i <= num; i++) {
            factorial = factorial * i;
            }
        }
        System.out.println("Fac" + factorial);

     }
}
