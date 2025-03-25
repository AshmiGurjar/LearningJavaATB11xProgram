package Tasks;

import java.util.Scanner;

public class Task05_Max_WithTernary {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and
        // calculate the maximum in between with ternary operator.
        //Take a user input - Name, Age and Salary and print them in the end.


        //Way 1
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
        String total = a>b ? a + " is greater than " +b : b +" is greater than" +a;
        System.out.println(total);

        //Way 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of 1:");
        Integer v1 = sc.nextInt();
        System.out.println("Value of 2:");
        Integer v2 = sc.nextInt();
        String total1 = v1>v2 ? v1 + " is greater than " +v2 : v2 +" is greater than" +v1;
        System.out.println(total1);





    }
}
