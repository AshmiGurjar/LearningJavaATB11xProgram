package Tasks;

import java.util.Scanner;

public class Task08_Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int number=scanner.nextInt();

        int n1 =0, n2=1, n3;
        for (int i = 0; i <= number; i++) {
            System.out.println(n1);
            n3 = n1 + n2;
            n1= n2;
            n2=n3;
        }

    }
}
