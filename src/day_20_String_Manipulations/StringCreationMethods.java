package day_20_String_Manipulations;
import java.lang.*;//import all classes from java lang package
import java. util.*;
import java .util.Scanner;
public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 ="imac";
        String word2 =new String("macbook");
        String word3 ="";
        String word4 =new String();
        System.out.println(word1);
        Scanner scan = new Scanner (System.in);
        String car = "lexus";
        System.out.println(car.isEmpty());//false -not empty
        String city = "";
        System.out.println(city.isEmpty());//true
        System.out.println(city.length()==0);//true
    }
}
