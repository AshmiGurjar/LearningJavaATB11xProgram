package ex_03_Java_Operators;

public class Lab018_Equal_interview {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 == 20);
        System.out.println(10 <= 20);

        //Interview Question
        System.out.println(!(10>20));

        System.out.println("OR Gate O/P ");
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        System.out.println("And Gate O/P ");
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        int balaji_salary=12;
        boolean b = !(balaji_salary>10 || balaji_salary <5);
        System.out.println(b);


    }
}
