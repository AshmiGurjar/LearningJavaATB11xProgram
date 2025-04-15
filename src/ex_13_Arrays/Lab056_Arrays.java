package ex_13_Arrays;

public class Lab056_Arrays {
    public static void main(String[] args) {

        //Ways of Creation Arrays
        //Way 1
        int[] test = {1,2,3,4,5,6};

        //Way 2
        int[] test2 = new int[5];   //Fixed Size
        int test3[] = new int[5];   //Fixed Size

        //Way 1
        String[] name_Class1 = {"Jay","Dev","Jatin"};
        System.out.println(name_Class1.length);
        System.out.println(name_Class1[0]);
        System.out.println(name_Class1[1]);
        System.out.println(name_Class1[2]);
        //System.out.println(name_Class1[-1]); //ArrayIndexOutOfBoundsException
        //System.out.println(name_Class1[7]); //ArrayIndexOutOfBoundsException

        String[] names= new String[2];
        names[0] = "Ashmi";
        names[1] = "Dhaval";

        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}
