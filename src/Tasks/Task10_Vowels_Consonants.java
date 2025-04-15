package Tasks;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Task10_Vowels_Consonants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String message = scanner.nextLine();
                                                                                                                                        message = message.toLowerCase();

        int vowels=0;
        int consonants=0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if(ch>='a' && ch<='z'){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' ){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " +vowels);
        System.out.println("Consonants: " +consonants);


    }
}
