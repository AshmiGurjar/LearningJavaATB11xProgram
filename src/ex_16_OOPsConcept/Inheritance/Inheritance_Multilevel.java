package ex_16_OOPsConcept.Inheritance;

class One{
    int a=10;
    void Display(){
        System.out.println(a);
    }
}

class Two extends One{
    int b=20;
    void Show(){
        System.out.println(b);
    }
}

class Three extends Two{
    int c=30;
    void Visible(){
        System.out.println(c);
    }
}


public class Inheritance_Multilevel {
    public static void main(String[] args) {
        Three three = new Three();
        System.out.println(three.a);
        System.out.println(three.b);
        System.out.println(three.c);
    }
}
