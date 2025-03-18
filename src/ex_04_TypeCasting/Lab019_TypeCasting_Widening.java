package ex_04_TypeCasting;

public class Lab019_TypeCasting_Widening {
    public static void main(String[] args) {

        //Type Casting

        byte b=10;
        int a=b; //Implicit  -> Convert smaller DT to bigger one
        int a1= (int) b;  //Explicit (Doesn't require)
        //Why need to add DT as JVM Already knows
    }
}
