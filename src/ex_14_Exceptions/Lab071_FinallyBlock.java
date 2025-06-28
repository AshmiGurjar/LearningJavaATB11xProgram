package ex_14_Exceptions;

public class Lab071_FinallyBlock {
    public static void main(String[] args) {

        String s = "Test";

        try {
            System.out.println(s.length());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This block is always executed");
        }
    }
}
