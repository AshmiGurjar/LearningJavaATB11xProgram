package Tasks;

import java.util.Scanner;

public class Task13_Even_Odd_Array {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int Data = sc.nextInt();

        int[] Value = new int[Data];

        for (int i = 0; i < Value.length; i++) {
            System.out.println("Enter the value: ");
            Value[i]= sc.nextInt();
        }

        for (int i = 0; i < Value.length; i++) {
            if (Value[i] %2 ==0){
                System.out.println("odd number" +Value[i]);
            }
            else {
                System.out.println("even number"+Value[i]);
            }
        }

    }
}
