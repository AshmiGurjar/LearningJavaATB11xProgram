package ex_12_String_StringBuffer_StringBuilder;

public class Lab054_StringBufferBuilder {
    public static void main(String[] args) {

        //String Buffer
        StringBuffer stringBuffer = new StringBuffer("Ashmi");
        stringBuffer.append("Gurjar");  //append to use concat a string
        System.out.println(stringBuffer);
        //only 1 string is created Ashmi is replace with ashmigurjar not 2 string is created

        //To reverse the string
        System.out.println(stringBuffer.reverse());

        //Ex_1 For string
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 +s2;
        System.out.println(s3);
        System.out.println(s1);
        //Here 3 String is created not 2 or 1

        //String Builder
        StringBuilder stringBuilder = new StringBuilder("Ashmi");
        stringBuilder.append(345);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

    }
}