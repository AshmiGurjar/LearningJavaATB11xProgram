package ex_12_String_StringBuffer_StringBuilder;

public class Lab055_StringBufferBuilder_Functions {
    public static void main(String[] args) {
        //StringBuffer functions

        StringBuffer f1 = new StringBuffer("Hello");
        f1.append(" World");
        f1.insert(5,","); //offset start with 1
        f1.replace(6,12,"Java");
        f1.delete(7,9);
        f1.reverse();
        System.out.println(f1.length());
        System.out.println(f1);

        //StringBuilder functions
        StringBuilder f2= new StringBuilder("Hi");
        f2.append(" Ashmi");
        f2.insert(3,","); //offset start with 1
        f2.replace(6,8,"Dh");
        f2.delete(7,9);
        f2.reverse();
        System.out.println(f2.length());
        System.out.println(f2);

        StringBuilder  sb = new StringBuilder("Demo of to string");
        String result = sb.toString();
        System.out.println(result); // Hello

        //⚠️ When to use:
        //Use StringBuffer when working with multi-threaded applications.
        //Use StringBuilder for single-threaded scenarios for better performance
    }
}
