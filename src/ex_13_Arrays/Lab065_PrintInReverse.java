package ex_13_Arrays;

import java.util.Arrays;

public class Lab065_PrintInReverse {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.println(a[i]);
        }

    }
}
