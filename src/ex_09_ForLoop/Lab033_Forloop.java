package ex_09_ForLoop;

public class Lab033_Forloop {
    public static void main(String[] args) {
        //For Loop
        //help you to repeat a block of code

        //Initialization > Condition > Updation(Inc/Dec)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //Ex_2
        for (int Shruti = 0; Shruti >= 18; Shruti++) {
            if (Shruti > 15) {
                System.out.println("Gift for papa");
            }
            else
                System.out.println("No gift for papa ");

        }
        //Ex_3
        for (long a=10; a<=10 ;a++){  //Can be able to with DataType
            System.out.println("Test");
        }

    }
}
