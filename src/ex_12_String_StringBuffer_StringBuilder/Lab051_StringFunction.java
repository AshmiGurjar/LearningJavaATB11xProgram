package ex_12_String_StringBuffer_StringBuilder;

public class Lab051_StringFunction {
    public static void main(String[] args) {

         char A ='A';
         System.out.println(A);
         String s = "test";

         //1. length()
        String str = "Hello";
        System.out.println(str.length()); // Output: 5

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
        String rpl = "banana";
        System.out.println(rpl.replace('a', 'o'));       // bonono
        System.out.println(rpl.replaceAll("na", "NA"));  // baNANA

        //8. Contains
        String str1 = "I love Java";
        System.out.println(str1.contains("Java")); // true

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

        //17. isEmpty() /isBlank (Java 11+)
        String a = "";
        String b = "   ";
        System.out.println(a.isEmpty()); // true
        System.out.println(b.isBlank()); // true

    }
}
