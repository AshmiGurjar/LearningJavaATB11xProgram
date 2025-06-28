package ex_04_TypeCasting;

//Up Casting - Covert value from smaller - larger
//int - long
//float - double

//Down Casting - Covert value from larger - smaller
//Long - int
//double - float

public class Lab073_TypeCasting {
    public static void main(String[] args) {

        //Up Casting
        int intvalue =100;
        long longvalue = intvalue;
        System.out.println(longvalue);

        float floatvalue=2.5f;
        double d = floatvalue;
        System.out.println(d);

        //Down Casting
        long l =10000;
        int i = (int) l;
        System.out.println(i);

        double d1 =2.58954891232426d;
        float f1 = (float) d1;
        System.out.println(f1);

    }

}
