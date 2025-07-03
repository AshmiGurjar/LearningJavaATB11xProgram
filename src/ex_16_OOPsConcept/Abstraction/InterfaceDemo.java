package ex_16_OOPsConcept.Abstraction;

interface Shape{
    int length=10;
    int width=5;

    void circle();  //Abstract method

    default void square(){
        System.out.println("this is square");
    }

    static void rectangle(){
        System.out.println("This is static rectangle");
    }
}

public class InterfaceDemo implements Shape {

    public void circle(){
        System.out.println("This is abstract method ");
    }

    public static void main(String[] args) {

        //Scenario 1
        InterfaceDemo i = new InterfaceDemo();
        i.circle();  //Abstract
        i.square();  //Default
        // rectangle(); //if it is added in class we can directly able to access
        Shape.rectangle();  //For interface need to add interface name

        //Scenario 2
        Shape s = new InterfaceDemo();
        s.circle();
        s.square();
        Shape.rectangle();

        System.out.println(Shape.length * Shape.width); //accessing static variables directly
    }
}
