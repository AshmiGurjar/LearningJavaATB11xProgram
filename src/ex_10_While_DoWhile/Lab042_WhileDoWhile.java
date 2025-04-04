package ex_10_While_DoWhile;

public class Lab042_WhileDoWhile {
    public static void main(String[] args) {
        int a=0;

        //While executed 0 time
        while(a<0){
            System.out.println(a);
            a++;
        }

        //Dowhile executed 1 time
        do {
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
