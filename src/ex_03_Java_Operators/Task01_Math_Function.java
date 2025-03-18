package ex_03_Java_Operators;

public class Task01_Math_Function {
    public static void main(String[] args) {
        double a=10,b=10, c=10;
        double result;
        result = Math.cbrt((Math.pow(a,2)) + (Math.pow(b,2)) - Math.abs(c));
        //System.out.println(Math.cbrt((Math.pow(a,2))+Math.pow(b,2)-Math.abs(c)));
        System.out.println(result);
    }
}
