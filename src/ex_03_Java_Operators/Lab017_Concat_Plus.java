package ex_03_Java_Operators;

public class Lab017_Concat_Plus {
    public static void main(String[] args) {
        System.out.println("Ashmi" + "Gurjar");

        //Math function
        int a =10;
        int b=20;
        System.out.println(a + b); //Combine doing math function

        String name1="Test";
        String name2="User";
        System.out.println(name1+name2); //Print String value

        //Behave differently with the data type
        //Operator overloading

        System.out.println(a + b + name1 +name2); //Working first as int and then string  //O/p 30TestUser

        System.out.println(name1 +name2 + a + b); //Working all are string  //O/p TestUser1020
        System.out.println(name1 +name2 + (a+b));
        //BODMAS =Bracket of Div, mul ,add, sub
    }
}
