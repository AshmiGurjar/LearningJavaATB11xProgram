package ex_12_String_StringBuffer_StringBuilder;

public class Lab051_StringFunction {
    public static void main(String[] args) {

         char A ='A';
         System.out.println(A);

         String s = "Test";

         //1. length
         System.out.println(s.length());

         //2. UpperCase
        System.out.println(s.toUpperCase());

        //3. Lowercase
        System.out.println(s.toLowerCase());

        //4.Concatenation
        System.out.println(s.concat(" Data"));
        System.out.println(s + "Data");

        //5. Returns character at given index
        System.out.println(s.charAt(1));

        //6. Trim
        System.out.println(s.trim());

        //7. Replace
        System.out.println(s.replace("e","a"));

        //8. Contains
        System.out.println(s.contains("test"));

        //9. Case-insensitive check
        System.out.println(s.equalsIgnoreCase(s));

        //10. Checks content equality available or not
        System.out.println(s.equals("test"));

        //11. Extracts substring
        System.out.println(s.substring(1,4));

        //12. Find Index
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf('s')); //Find last index


        //13. Split
        String name = "Test@123@Democlass";
        String[] split = name.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //14. Starts with> Boolean function
        System.out.println(s.startsWith("a"));

        //15. Ends with string
        System.out.println(s.endsWith("t"));

        //16.Compare
        System.out.println(s.compareTo("Test"));
        System.out.println(s.compareToIgnoreCase("Test"));


    }
}
