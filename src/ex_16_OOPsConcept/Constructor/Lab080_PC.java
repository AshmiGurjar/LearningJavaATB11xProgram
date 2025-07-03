package ex_16_OOPsConcept.Constructor;

public class Lab080_PC {
    public static void main(String[] args) {

        Person p = new Person();
        Person p1 = new Person(101,"Ashmi");
        p1.printPerson();

    }
}

class Person{
    int id;
    String name;

    Person(){
        System.out.println("Default Person");
    }
    Person(int id,String name){
        this.id = id;
        this.name = name;
    }
    void printPerson(){
        System.out.println("id: " +id +"name:" +name);
    }
}