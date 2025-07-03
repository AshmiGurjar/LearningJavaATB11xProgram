package ex_17_Keywords;

public class StaticKeyword {

    static int a=10;
    int b = 20;

    static void m1(){
        System.out.println("m1 Static method");
    }

    void m2(){
        System.out.println("m2 non static method");
    }

    public static void main(String[] args) {

        //Static method can access static stuff directly (Without calling object)
        System.out.println(a);
        m1();

        //Non static method also able to access (with calling object)
        StaticKeyword s = new StaticKeyword();
        System.out.println(s.b);
        s.m2();

    }
}
