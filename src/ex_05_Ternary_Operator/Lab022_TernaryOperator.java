package ex_05_Ternary_Operator;

public class Lab022_TernaryOperator {
    public static void main(String[] args) {
        // ? :
        //condition ? expression1 : expression2
        //Ex_1
        int age=10;
        String canIVote = age>=18 ? "Yes,I can"  : "No, I Can't" ;
        System.out.println(canIVote);

        //Ex_2
        int number= 5;
        String result = number >0 ? "Positive" : "Negative";
        System.out.println(result);

    }
}
