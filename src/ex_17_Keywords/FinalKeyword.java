package ex_17_Keywords;

class Test{
    //int x=100;
    final int x=100;
}

public class FinalKeyword {
    public static void main(String[] args) {
        Test test = new Test();
        //test.x=200;  //Can't change once assign to final variable value
        System.out.println(test.x);
    }
}
