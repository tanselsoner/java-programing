package day_26_forLoop;

public class PrintChars {
    public static void main(String[] args) {
        String word ="Adana Demir";
        System.out.println(word.length());
        for(int i =0;i< word.length();i++){
            System.out.print(word.charAt(i));
        }
        //long way without loop
        //System.out.println(word.charAt(0));
        //System.out.println(word.charAt(1));
        //System.out.println(word.charAt(2));
        //System.out.println(word.charAt(3));
        System.out.println();
    for(int i =10;i>=0;i--){
        System.out.print(word.charAt(i));
    }
    }
    }

