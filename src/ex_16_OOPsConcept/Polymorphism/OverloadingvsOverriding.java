package ex_16_OOPsConcept.Polymorphism;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC{
    void m1(int a){   //Overriding
        System.out.println(a+a);
    }

    void m2(int a,int b){  //Overloading
        System.out.println(a+b);
    }
}

public class OverloadingvsOverriding {

    public static void main(String[] args) {
        XYZ xyz = new XYZ();
        xyz.m1(10);  //overriding method is calling
        xyz.m2(5, 10);
        xyz.m2(42);
    }
}
