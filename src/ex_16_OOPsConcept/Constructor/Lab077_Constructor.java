package ex_16_OOPsConcept.Constructor;

public class Lab077_Constructor {

    public static void main(String[] args) {
        Baby b1 = new Baby();//When we call this Default constructor automatically call
    }
}

class Baby{
    String name;



    void cry(){
        System.out.println("Cry");
    }

    void sleep(){
        System.out.println("sleep");
    }

    void eat(){
        System.out.println("eat");
    }

    Baby(){
        System.out.println("Default constructor");
    }
}
