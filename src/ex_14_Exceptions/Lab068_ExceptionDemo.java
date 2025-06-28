package ex_14_Exceptions;

import java.util.Scanner;

public class Lab068_ExceptionDemo {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter the position from 0-4");
    int pos = sc.nextInt();

        System.out.println("Enter the value");
        int value = sc.nextInt();

        a[pos]=value;

        System.out.println(a[pos]);

    }
}
