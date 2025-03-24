package ex_06_IncrementDecrement_Operator;

public class Lab024_PrePost_Increment {
    public static void main(String[] args) {
        //Pre-Increment -> ++Operand
        //Value is incremented first and then store into the result
        //Increased by 1

        int a =10;
        int b =++a; //10+1 //11
        System.out.println(b); //11
        System.out.println(a); //11

        //Post-Increment -> Operand++
        //Value is print first and then incremented first
        //Increased by 1
        int a_post=10;
        System.out.println("Post Increment value: "+a_post++); //10 > after print > 11
        System.out.println(a_post); //11

    }
}
