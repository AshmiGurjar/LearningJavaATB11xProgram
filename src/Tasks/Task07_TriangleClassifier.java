package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task07_TriangleClassifier {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Side 1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the value of Side 2");
        int side2= scanner.nextInt();
        System.out.println("Enter the value of Side 3");
        int side3 = scanner.nextInt();

        if(side1 <=0 || side2 <=0 || side3 <=0){
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        if(side1+side2 <= side3 || side2+side3 <=side1 || side1+side3 <=side2){
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        //Real logic comes here
        if(side1 ==side2 && side2==side3){
            System.out.println("This is the Equilateral triangle");
        } else if (side1 ==side2 || side2==side3 || side3==side1) {
            System.out.println("This is isosceles triangle");
        } else {
            System.out.println("This is scalene triangle");
        }

    }
}
