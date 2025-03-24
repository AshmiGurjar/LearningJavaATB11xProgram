package ex_06_IncrementDecrement_Operator;

public class Lab025_Ex_IncrementOperator {
    public static void main(String[] args) {
        //Ex_1
        int a =10;
        int result =++a;
        System.out.println(result); //11
        System.out.println(a);  //11

        //Ex_2
        int a_post =10;
        int result_post =a_post++; //10
        System.out.println(result_post); //10
        System.out.println(a_post); //11

        //Ex_3
        int c=10;
        System.out.println(c++ + c); //10 +11

        //Ex_4
        System.out.println("Example 4");
        int d=10;
        System.out.println(d++ + ++d); // 10 + 12 > 22
        System.out.println(d);  //12

        //Ex_5
        System.out.println("Example 5");
        int e=10;
        System.out.println(++e + ++e); // 11 + 12
        System.out.println(e); // 12


    }
}
