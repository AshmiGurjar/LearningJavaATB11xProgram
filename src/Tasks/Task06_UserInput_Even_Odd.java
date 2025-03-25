package Tasks;
import java.util.Scanner;

public class Task06_UserInput_Even_Odd {
    public static void main(String[] args) {
        //Take user input & Check weather the input is even or odd number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number to check Even Or Odd");
        Integer a = sc.nextInt();

        if (a%2==0){
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even");
        }
    }
}