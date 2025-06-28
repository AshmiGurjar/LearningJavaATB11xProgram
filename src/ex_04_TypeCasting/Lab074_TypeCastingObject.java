package ex_04_TypeCasting;

class Parent{
    String name = "john";
    void m1(){
        System.out.println("M1 from parent");
    }
}

class Child extends Parent{
    int id=101;
    void m2(){
        System.out.println("M2 from child");
    }
}

public class Lab074_TypeCastingObject {
    public static void main(String[] args) {

//        //Way 1
//        Child child=new Child();
//        System.out.println(child.name);
//        child.m1();
//        System.out.println(child.id);
//        child.m2();

        //Way 2
        Parent p = new Child();  //upcasting
        System.out.println(p.name);
        p.m1();
        //Able to access var and method from parent not child as we create object from parent

        //Way 3
        Parent parent = new Parent();  //down casting
        Child c = (Child) parent;
        System.out.println(c.name);
        System.out.println(c.id); //compile time allow run time not
        c.m1();
        c.m2();  //compile time allow run time not



    }
}