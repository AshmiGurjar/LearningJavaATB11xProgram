package ex_11_Functions;

public class Lab046_UserDefinedFunction {
    public static void main(String[] args) {
//        4 Types user defined function
//        parameter/argument : Input to the function
//        return type : which data type will it return
//            a. void        -> Nothing to return
//            b. return type -> Data type (Primitive Data type - byte,int,float,etc)
//
//        Use of function: reusability of code

        //1. without parameter and without return type
        Greet_One();

        //2. without parameter and with return type
        String msg=Greet_Two();
        System.out.println(msg);
        System.out.println(Greet_Two());  //Also able to write this

        //3. with parameter and without return type
        Greet_Three("ashmi",15,5000);
        Greet_Three("Hani",12,7000);
        Greet_Three("bhoomi",18,8000);

        //4. with parameter and with return type
        int sum = Greet_Four(5,8,7);
        System.out.println(sum);


    }

    //1. without parameter and without return type
    static void Greet_One(){
        System.out.println("Hi,How are you?");
    }

    //2. without parameter and with return type
    static String Greet_Two(){
        System.out.println("Hi");
        return "Good Days";
    }

    //3. with parameter and without return type
    static void Greet_Three(String name,int age,double salary){
        System.out.println("Name is: "+ name + "\n" +
                "Age is: " +age+  "\n" +
                "Salary is: " +salary);
    }

    //4. with parameter and with return type
    static int Greet_Four(int a,int b,int c){
        return a+b+c;
    }

}
