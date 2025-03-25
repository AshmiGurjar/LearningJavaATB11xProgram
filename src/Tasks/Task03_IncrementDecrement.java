package Tasks;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {

       //Task_1
        int a=10;
        System.out.println(++a + a++ + a++); //34
        System.out.println(a);//13

        //Task_2
        int b=20;
        System.out.println(--b + b++ + b--); //58
        // 19 19 20
    }
}
