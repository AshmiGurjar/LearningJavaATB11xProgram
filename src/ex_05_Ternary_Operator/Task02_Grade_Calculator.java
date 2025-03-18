package ex_05_Ternary_Operator;

import java.util.Scanner;

public class Task02_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks =sc.nextInt();

        String result = (marks >=90 && marks<=100) ? "A" :
                (marks>=80 && marks<=89) ? "B" :
                        (marks>=70 && marks<=79) ? "C" :
                                (marks>=60 && marks<=69) ? "D" :
                                        (marks>=0 && marks<=59) ? "F" : "Invalid Marks" ;
        System.out.println("Student result marks is:  "+result);

    }
}
