package ex_16_OOPsConcept.Constructor;

public class Lab078_Const {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name="Tesla";
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}
    class Car{
        String name;
        int year;
        String model;

        Car(){
            name = "Creta";
            year = 2018;
            model = "AV";
        }
    }

