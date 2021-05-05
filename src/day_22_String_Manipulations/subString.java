package day_22_String_Manipulations;

public class subString {
    public static void main(String[] args) {
        String word = "java is fun";
        //word.substring(startIndex,endIndex)
        System.out.println(word.substring(0,4));
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8,11));
        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
    }
}
