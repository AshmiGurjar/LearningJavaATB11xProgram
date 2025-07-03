package ex_16_OOPsConcept.Constructor;

public class Lab079_ParameterizedConst {
    public static void main(String[] args) {
        Car_D carD = new Car_D();
        Car_D c = new Car_D("Aura", 2023);
        System.out.println(c.name + " " +c.lauch_year);
    }
}


    class Car_D {
        String name;
        int lauch_year;

        Car_D() {
        name = "Swift";
        lauch_year =2024;
            System.out.println("Test");
        }

        Car_D(String name, int lauch_year) {
            this.name = name;
            this.lauch_year = lauch_year;
        }
    }