package Tasks;

import java.util.Scanner;

public class Task11_Palindrome_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
