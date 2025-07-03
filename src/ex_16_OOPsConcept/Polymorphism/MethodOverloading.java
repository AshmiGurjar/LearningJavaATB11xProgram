package ex_16_OOPsConcept.Polymorphism;



public class MethodOverloading {
    int a=10, b=20;

    void sum(){
        System.out.println(a+b);
    }

    void sum(int x, int y){
        System.out.println(x+y);
    }

    void sum(int x,double y){
        System.out.println(x+y);
    }

    void sum(double x ,int y){
        System.out.println(x+y);
    }

    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum();
        methodOverloading.sum(4,5.1);
    }
}
