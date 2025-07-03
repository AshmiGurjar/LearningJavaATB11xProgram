package ex_17_Keywords;

class Animal{
    String Color ="white";

    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    String Color="Black";

    void Display(){
        System.out.println(Color);  //Print- Black
        System.out.println(super.Color);  //Print - White
    }

    void eat(){
        //System.out.println("eating in Dog class");  //This will print when not added super
        super.eat();  //Print message from parent class
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Display();
        d.eat();
    }
}
