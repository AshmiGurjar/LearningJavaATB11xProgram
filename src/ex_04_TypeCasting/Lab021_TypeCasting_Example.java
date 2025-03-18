package ex_04_TypeCasting;

public class Lab021_TypeCasting_Example {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;
       // int total = course + GST ; //Narrow-Implicit
        int total = course + (int)GST ;  //Narrow-Explicit
        System.out.println(total);  //Only Int value come

        float total1 = course + GST ;  //Widening -Auto Implicit
        System.out.println(total1);

        float total2 = (float) course + GST ;  //Widening -Explicit
        System.out.println(total2);
    }
}
