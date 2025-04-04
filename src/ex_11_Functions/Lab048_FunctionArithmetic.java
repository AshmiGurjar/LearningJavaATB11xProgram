package ex_11_Functions;

import java.util.Scanner;

public class Lab048_FunctionArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 1: ");
        int value_1=0;
        int value_2=0;
        if(sc.hasNextInt()){
             value_1 = sc.nextInt();
        }
        else {
            System.out.println("Enter only integer value");
            System.exit(0);
        }

        System.out.println("Enter the value of 2: ");

        if(sc.hasNextInt()){
            value_2 = sc.nextInt();
        }
        else {
            System.out.println("Enter only integer value");
            System.exit(0);
        }

        int add = sum_of_numbers(value_1,value_2);
        int sub = sub_of_numbers(value_1,value_2);
        int mul = mul_of_numbers(value_1,value_2);
        int div = div_of_numbers(value_1,value_2);
        int module = module_of_numbers(value_1,value_2);


        System.out.println("Sum is: " +add);
        System.out.println("Sub is: " +sub);
        System.out.println("Mul is: " +mul);
        System.out.println("Div is: " +div);
        System.out.println("Module is: " +module);

    }


    static int sum_of_numbers(int a,int b){
        return a+b;
    }
    static int sub_of_numbers(int a,int b){
        return a-b;
    }
    static int mul_of_numbers(int a,int b){
        return a*b;
    }
    static int div_of_numbers(int a,int b){
        if(a==0 || b==0 ){
            System.out.println("Not able to do division with 0");
            System.exit(0);
        }
        return a/b;
    }
    static int  module_of_numbers(int a,int b){
        return a%b;
    }

}

