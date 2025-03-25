package ex_06_IncrementDecrement_Operator;

public class Lab026_PrePost_Decrement {
    public static void main(String[] args) {
        //Pre-Decrement -> --Operand
        //Value is Decremented first and then store into the result
        //Decreased by 1

        int a =10;
        int b =--a;
        System.out.println(b); //9
        System.out.println(a); //9

        //Post-Increment -> Operand--
        //Value is print first and then Decremented
        //Decreased by 1
        int a_post=10;
        System.out.println("Post Decrement value: "+a_post--); //10
        System.out.println(a_post); //9
    }
}
