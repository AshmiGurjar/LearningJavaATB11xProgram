package ex_09_ForLoop;

public class Lab036_For_ContinueEven {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            if (i%2==0){
                System.out.println("Even" +i);
                continue;
            }
            System.out.println("Odd"+i); //if condition is true then this is not executed
        }

    }
}
