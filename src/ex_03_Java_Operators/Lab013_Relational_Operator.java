package ex_03_Java_Operators;

public class Lab013_Relational_Operator {
    public static void main(String[] args) {
        //With relational Operator > o/p > Boolean
        int a = 10;
        int  b= 30;
        boolean c;
        c = a > b;
        System.out.println(c);

        //Ex_2
        int age_dhaval= 30;
        int age_ashmi = 25;
        boolean result = age_dhaval>= age_ashmi;
        System.out.println(result);

        int data_a = 5;
        int data_b = 7;
        System.out.println(data_a > data_b);
        System.out.println(data_a < data_b);
        System.out.println(data_a >= data_b);
        System.out.println(data_a <= data_b);
        System.out.println(data_a != data_b);
        System.out.println(data_a == data_b);

    }
    }