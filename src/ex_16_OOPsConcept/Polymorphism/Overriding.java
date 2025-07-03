package ex_16_OOPsConcept.Polymorphism;

//this concept is truely belongs to inheritance concept

class Bank{
    double roi(){
        return 0;
    }
}

class ICICI extends Bank{
    double roi(){
        return 10.5;
    }
}

class SBI extends Bank{
    double roi(){
        return 12.85;
    }
}

public class Overriding {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        System.out.println(icici.roi());

        SBI sbi = new SBI();
        System.out.println(sbi.roi());
    }
}
