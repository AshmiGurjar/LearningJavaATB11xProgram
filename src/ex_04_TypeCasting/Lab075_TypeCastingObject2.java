package ex_04_TypeCasting;

// Cat ct =(Cat) an;
//  a   b    c    d

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class Lab075_TypeCastingObject2 {
    public static void main(String[] args) {

        //Rule 1: Conversion is valid or not
        //The type of  d and c must have relationship (either parent-child or child-parent)

        Animal an = new Dog();
        Cat ct = (Cat) an;  //Valid Rule 1

        Dog dg = new Dog();
       // Cat cat = (Cat)  dg; //Invalid Rule 1

        //Rule 2: Assignment is valid or not
        //'C' must be either same or child of 'A'

        Animal a1n= new Dog();
        Cat c1t = (Cat) a1n;  //Valid Rule 2

        Animal a2n= new Dog();
     //   Cat ct2 = (Dog) a2n;  //InValid Rule 2

        //Rule 3: Underlying object type D must be either same or child of C

        Animal an2 = new Dog();
        Cat ct3 = (Cat) an2;  //invalid

        Animal animal = new Dog();// 4
        Dog dog =(Dog) animal;  //Rule 1yes 2yes 3yes  //3 both should be same for rule 3
    }
}
