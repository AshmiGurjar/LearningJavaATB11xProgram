package ex_05_Ternary_Operator;

public class Lab023_Nested_TernaryOperator {
    public static void main(String[] args) {
        //Nested Ternary
        //result = condition 1 ? expression 1 : expression 2
        //result = condition1 ? expression 1 :(condition 2 ? expression 2 : expression 3);

        int number = 25;
        String result = (number >10) ? ((number >20) ? "Number is greater" : "Number is smaller") : "B" ;
        System.out.println(result);

        //Ex_2 -> Find max number between 2 numbers
        int x=10;
        int y=20;
        System.out.println(Math.max(x,y));
        String max= x>y ? "x is max": "y is max";
        System.out.println(max);

        //Ex_3 -> Even Odd
        int num= 5;
        String res = (num%2==0) ? "Number is even" : "Number is Odd";
        System.out.println(res);

        //Ex_4 -> 3 Max number
        int n1=2;
        int n2=5;
        int n3=4;

        //n1>n2 & n1>n3 -n1
        //n2>n3 & n2>n1- n2
        //n3
        int maximum = (n1 >n2) ?(n1>n3) ? n1 : n3 : ((n2>n3) ?n2 :n3);
        System.out.println(maximum);

        //Ex_5-> Real Age Classification
        String age1 =args[0];
        int age = Integer.parseInt(age1);

        String age_result = (age <18) ? "Minor" : ((age<65) ? "Adult" : "Senior") ;
        System.out.println("age is:" + age_result);

    }
}
