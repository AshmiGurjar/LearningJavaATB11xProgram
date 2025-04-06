package ex_12_String_StringBuffer_StringBuilder;

public class Lab053_String_Buffer_Builder {
    public static void main(String[] args) {

        String s1 = "Ashmi"; //store> String Constant Pool
        String s2 = new String("Ashmi");  //Stored in Object

        StringBuffer s3 = new StringBuffer("Ashmi");  //Stored in Object
        StringBuilder s4 = new StringBuilder("Ashmi");  //Stored in Object

        //4 Diff type of string created

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
