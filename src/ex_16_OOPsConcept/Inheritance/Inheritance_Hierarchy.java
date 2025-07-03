package ex_16_OOPsConcept.Inheritance;

class Parent{
    void display(int a){
        System.out.println(a);
    }
}

class Child1 extends Parent{
    void print(int b){
        System.out.println(b);
    }
}

class Child2 extends Parent{
    void show(int c){
        System.out.println(c);
    }
}

public class Inheritance_Hierarchy {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.print(100);
        child1.display(200);

        Child2 child2 = new Child2();
        child2.show(500);
        child2.display(600);
    }
}
