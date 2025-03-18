package ex_02_Java_Literals;

public class Lab011_Primitive_Literals {
    public static void main(String[] args) {

        //Primitive Data type (Defined by Java Guys)
        int age=55;
        age=60;

        float pi=20F;

        boolean is_married=true;
        boolean is_married_now=false;

        int Enum=6;  //enum is keyword
        System.out.println(Enum);

        char c= 'A'; //A-Z a-z #$%^&*(
        // char c1= "Data"; this not character it's string

        //Escape Char
        /* Escape char means it have meaning during the console */
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Ashmi Gurjar");
        System.out.println("Ashmi" + new_line +"Gurjar");
        System.out.println("Ashmi" + tab_line +"Gurjar");
        System.out.println("Ashmi" + back_space +"Gurjar");
        System.out.println("Ashmi is good" + carriage_return +"Gurjar");

        System.out.println("Hi, This is first line" +new_line+ "This is second line" +new_line + "This is third line");
    }
}
