package ex_08_Switch;

public class Lab031_Switch_JDK13 {
    public static void main(String[] args) {
        //Allow JDK>13 and above
        //1 line Java code not need to break if 1 line code
        int item=14;
        switch (item) {
            case 001 -> System.out.println("1");
            case 002 -> System.out.println("2");
            case 003 -> System.out.println("3");
            default -> System.out.println("default");
        }

        //Comma seprated

        int itemcode=5;
        switch (itemcode){
            case 001,002,005: {
                System.out.println("All are devices");
                break;
            }
            case 003,004: {
                System.out.println("All are accessories");
                break;
            }
            default:
                System.out.println("Nothing to print");
        }
    }
}
