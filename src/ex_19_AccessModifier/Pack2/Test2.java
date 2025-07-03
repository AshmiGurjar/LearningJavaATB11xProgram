package ex_19_AccessModifier.Pack2;
import ex_19_AccessModifier.Pack1.Test1;

import ex_19_AccessModifier.Pack1.Test1;

public class Test2  extends Test1{
    public static void main(String[] args) {

        Test2 test2 = new Test2();
        test2.m1();
        System.out.println(test2.x);

    //    Test1 test1= new Test1();
    //    System.out.println(test1.x); //Not able to access bcz in diff package
    }
}
