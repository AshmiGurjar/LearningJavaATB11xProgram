package ex_10_While_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Lab040_GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess=random.nextInt(5)+1; //if I want boundary value then need to add+1
        System.out.println("Value of random:"+numberToGuess);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to guess:");

        int attempt=0;
        while (true){
           int guessValue=sc.nextInt();
            attempt++;
            if(guessValue< numberToGuess){
                System.out.println("To low,Try another");
            }
            else if (guessValue > numberToGuess){
                System.out.println("To high,Try another");
            }
            else {
                System.out.println("Right guess with " +attempt+"attempts");
                break;
            }
        }
    }
}