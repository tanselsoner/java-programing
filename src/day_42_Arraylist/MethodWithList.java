package day_42_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        //declare String arraylist add values
        List<String>words = new ArrayList<>();
        words.add("java");words.add("html");words.add("selenium");words.add("a");
        words.add("input");words.add("title");
        //pass the words list to printStrList method
     printStrList(words);
     printStrList(Arrays.asList("select","option","br","python","sql","api"));
     
     List<Integer> nums=Arrays.asList(23,54,23,54554,234,11,5,2);
      int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }
    public static void printStrList(List<String> stringList){
        for(String str :stringList){
            System.out.print(str+ " ");
        }
        System.out.println();}

     public static  int sumIntegerList(List<Integer> list) {
         int sum = 0;
         for (int i : list) {
             sum+= i;

         }
     return sum;

     }
}
