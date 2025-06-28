package ex_14_Exceptions;

import java.util.InputMismatchException;

public class Lab070_MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Program Started");
        String s = null;

        try {
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");

            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("InputMismatchException");

            System.out.println(e.getMessage());

        }
    }
}
