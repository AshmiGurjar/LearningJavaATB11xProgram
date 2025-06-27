package ex_13_Arrays;

import java.util.Arrays;

public class Lab064_SortingElementsInArray {
    public static void main(String[] args) {
        int a[] = {100,600,200,500,450};

        System.out.println("Before Sorting" +Arrays.toString(a)); //to print the list of arrays in proper format of array

        Arrays.sort(a); //To sorting the array

        System.out.println("After Sorting" +Arrays.toString(a));

        char b[] = {'C', 'E','R','A','P'};

        System.out.println("Before Sorting" +Arrays.toString(b)); //to print the list of arrays in proper format of array

        Arrays.sort(b); //To sorting the array

        System.out.println("After Sorting" +Arrays.toString(b));





    }
}
