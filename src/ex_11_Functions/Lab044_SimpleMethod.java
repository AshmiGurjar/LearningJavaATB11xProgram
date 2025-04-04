package ex_11_Functions;

public class Lab044_SimpleMethod {
    public static void main(String[] args) {
    ashmi();
        int f1_Call = f1();
        System.out.println(f1_Call);

        boolean f2_Call = f2();
        System.out.println(f2_Call);

        float f3_Call = f3();
        System.out.println(f3_Call);

        byte f4_Call = f4();
        System.out.println(f4_Call);

        long f5_Call = f5();
        System.out.println(f5_Call);

    }

    static void ashmi(){
        System.out.println("Hello");  //void doesn't return anything
    }

    static int f1(){
        System.out.println("Funtion_1"); //Except void return something
        return 10;
    }

    static boolean f2(){
        return true;
    }

    static float f3(){
        return  2.14f;
    }

    static byte f4(){
        return 100;
    }

    static  long f5(){
        return 25l;
    }
}
