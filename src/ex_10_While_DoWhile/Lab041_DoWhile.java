package ex_10_While_DoWhile;

public class Lab041_DoWhile {
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println("This is a body,which will executed 1 time");
            System.out.println(a);
            a++;
        }while (a<10);
    }
}
