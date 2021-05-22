package day_45_oop;

public class comparingStrings {
    public static void main(String[] args) {
        String word1="java";//in String pool
        String word2="java";//re-use from string pool
        String word3=new String ("java");//create new object in HEAP,outside String pool
        String word4=new String("java");//create new object in HEAP,outside String pool
        //"==" it compares if its pointing same object
        System.out.println(word1 == word2);//TRUE
        System.out.println(word1 == word3);//FALSE
        System.out.println(word3 == word4);//FALSE-->point different object in HEAP
       //.equals compares value
        System.out.println(word1.equals(word2));//true
        System.out.println(word1.equals(word3));//true
        System.out.println(word3.equals(word4));//true
    }
}
