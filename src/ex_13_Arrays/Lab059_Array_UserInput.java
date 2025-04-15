package ex_13_Arrays;

import java.util.Scanner;

public class Lab059_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size = sc.nextInt();

        int[] student_mark = new int[size];
        for (int i = 0; i < student_mark.length; i++) {
            System.out.println("Enter the numbers");
            student_mark[i] = sc.nextInt();
        }

        for (int i = 0; i < student_mark.length ; i++) {
            System.out.println(student_mark[i]);
        }
        sc.close();
    }
}
