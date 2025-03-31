package ex_08_Switch;

public class Lab032_Interview {
    public static void main(String[] args) {
        int a = 11;

        switch (-1) { //this
            default:
                System.out.println("Default");
                break;
            case -1:  //this both matching
                System.out.println("-1"); //this will going to print
                break;
            case 3:
                System.out.println("3");
                break;
        }
    }
}
