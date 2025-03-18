package ex_04_TypeCasting;

public class Lab020_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int value=300;    //int-> 32 bits memory required
        //byte b = value;  //Implicit casting is not allowed
        byte b = (byte) value; //Explicit casting -valid | byte -> 8 bits memory required
        //Data loss will occur
        System.out.println(b); //last 8 digit display > convert binary to decimal with 2's compliment


    }
}
