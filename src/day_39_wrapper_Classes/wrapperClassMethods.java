package day_39_wrapper_Classes;

public class wrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN INT " + Integer.MIN_VALUE);
        System.out.println("MAX INT " +Integer.MAX_VALUE);
         //used in if statement
        System.out.println(Double.compare(5,1));//first larger
        System.out.println(Double.compare(5,5));//equal
        System.out.println(Double.compare(5,45));//first smaller

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter= 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS FuN";
        for(int i=0;i < word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){ //isLoverCase shows small
                System.out.print(word.charAt(i));
            }
            System.out.print(Character.MIN_VALUE);
            System.out.print(Character.MAX_VALUE);

        System.out.print(Boolean.TRUE);}



    }
}
