package ex_18_WrapperClass;

public class DataConversionMethod {
    public static void main(String[] args) {

        //String s="Welcome";  //Not possible string value
        String s="1452";
        System.out.println(Integer.parseInt(s));

        String s1 = "12.5";
        String s2 = "5.4";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));

        String s3 = "data";
        System.out.println(Boolean.parseBoolean(s3));

        int a = 5;
        double b = 4.25;
        String c = "Hi";
        boolean d = true;
        char e = 'C';

        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(e));
    }
}
