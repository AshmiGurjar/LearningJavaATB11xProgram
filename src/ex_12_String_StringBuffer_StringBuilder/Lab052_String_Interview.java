package ex_12_String_StringBuffer_StringBuilder;

public class Lab052_String_Interview {
    public static void main(String[] args) {

        //Ex_1
        //How many strings are available ?
        String s1="hello"; //SCP
        String s5="Hello";
        String s7="Hello";
        //Answer is 1 not 3.

        //Ex_2
        // String > == > Check the location ref
        String s2 = new String("Hello");  //OA
        String s4 = new String("Hello");
        String s6 = new String("Hello");

        System.out.println(s1 == s2); //Both have different location.Ans is False
        System.out.println(s4 == s6); //No both are in diff object location
        System.out.println(s5 == s7); //yes

        //String to compare use (equals)
        System.out.println(s1.equals(s2));            //to compare value with case sensitive
        System.out.println(s1.equalsIgnoreCase(s2));  //to compare value without case sensitive
    }
}
