package ex_13_Arrays;

import java.util.Arrays;

public class Lab057_Array_Print {
    public static void main(String[] args) {
        int[] marks = {51,100,91,87,90};
        System.out.println(marks.length);

        //Way_1 Normal Way
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println("----------------------");

        //Way_2 Using for Loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //Array Class-Available in Collection frame work
        Arrays.sort(marks);  //To sort the array content
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
