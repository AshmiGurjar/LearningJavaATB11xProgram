package Tasks;

import java.util.Scanner;

public class Task11_Palindrome_String {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the input,I will check palindrome:");
//        String input = scanner.nextLine();
//
//        String reversed = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);
//        }
//
//        if (input.equalsIgnoreCase(reversed)) {
//            System.out.println("The string is a palindrome!");
//        } else {
//            System.out.println("The string is not a palindrome.");
//        }
//        scanner.close();

        //Way 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input to check palindrome");
        String userInput = sc.next();
        String newString =reversedString(userInput);

        if(newString.equalsIgnoreCase(userInput)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    private static String reversedString(String userInput) {
        String reversed ="";
        for (int i = userInput.length() -1; i >=0 ; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed;
    }

}
