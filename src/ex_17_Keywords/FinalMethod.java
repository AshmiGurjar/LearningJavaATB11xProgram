package ex_17_Keywords;

class Test1{
      void m1(){
     //final void m1(){
        System.out.println("This is m1 method from test1");
    }
}

class Test2 extends Test1{
    void m1(){  //when method is override can't be able to access
        System.out.println("This is m2 method from test2");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.m1();
    }
}