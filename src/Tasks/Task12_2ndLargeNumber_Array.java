package Tasks;

import java.util.Scanner;

public record Task12_2ndLargeNumber_Array() {
    public static void main(String[] args) {
        //Find Second Largest Number in an Array in java without any function

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size in(int)");
        int size = sc.nextInt();

        int[] value = new int[size];
        for (int i = 0; i < value.length; i++) {
            System.out.println("Enter the value: ");
            value[i] = sc.nextInt();
        }

        int max =0;
        int sec_max = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i]>max){
                sec_max = max;
                max =value[i];
            } else if (value[i]>sec_max && value[i]!=max) {
                sec_max = value[i];
            }
        }
        System.out.println("Highest value: "+max);
        System.out.println("Second Highest value: "+sec_max);



        //Way 2 For each loop

        int[] arr = {10, 25, 5, 30, 20};

        int largest = 0;
        int secondLargest = 0;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second largest number is: " + secondLargest);
    }
}
