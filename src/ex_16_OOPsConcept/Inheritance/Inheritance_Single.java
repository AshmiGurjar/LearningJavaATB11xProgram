package ex_16_OOPsConcept.Inheritance;

class A{
    int a=10;
    void Display(){
        System.out.println(a);
    }
}

class B extends A{
    int b=20;
    void Show(){
        System.out.println(b);
    }
}



public class Inheritance_Single {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(b.b);
        b.Display();
        b.Show();
    }
}
