package ex_16_OOPsConcept.Abstraction;

public class C1 extends C2 implements I1,I2 {

    @Override
    public void m1() {
        System.out.println(X);
    }

    @Override
    public void m2() {
        System.out.println(Y);
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.m1();
        c1.m2();
        c1.m3();
    }
}
