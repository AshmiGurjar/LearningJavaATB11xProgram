package ex_11_Functions;

public class Lab045_UDFunction {
    public static void main(String[] args) {

        int s1=sumof2Number(5,7);
        int s2=sumof2Number(4,2);
        System.out.println(s1);
        System.out.println(s2);
    }

    static int sumof2Number(int a,int b){
        return a+b;
    }
}
