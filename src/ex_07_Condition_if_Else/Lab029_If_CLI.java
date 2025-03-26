package ex_07_Condition_if_Else;

public class Lab029_If_CLI {
    public static void main(String[] args) {
        Integer i = Integer.parseInt(args[0]);

        if(i >10){
            System.out.println("Student in Higher secondary");
        }
        else {
            System.out.println("Student in Primary");
        }
    }
}
