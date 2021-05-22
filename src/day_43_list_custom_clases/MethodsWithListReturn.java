package day_43_list_custom_clases;

import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        long start =System.nanoTime();
        //System.out.println( System.nanoTime());
        List<Integer>mlnNums = getIntegerList();//returns ready array list object
        //no need for new array list
        long end =System.nanoTime();
        double listSeconds=(end-start)/1-000_000_000.0;
        System.out.println("ArrayList time = " +(end-start));
        System.out.println("ArrayList Seconds = "+ listSeconds);
        long st = System.nanoTime();
      int[] arr = getIntegerArray();
      long en = System.nanoTime();
      double seconds=(en-st)/1-000_000_000.0;
        System.out.println("Array time = " +(en-st));
        System.out.println("Array time Seconds = "+ seconds);


        System.out.println(mlnNums); }
 public static List<Integer> getIntegerList (){
   List<Integer>nums = new ArrayList<>();
   for(int i =0; i <=1_000_000;i++){
       nums.add(i);
   }
   return nums;
 }
public static int[] getIntegerArray(){
        //declare empty array with size-1_000_001
 int[]  nums=new int[1_000_001]  ;
 for (int i=0; i<=1_000-000; i++){
     nums[i]=i;

 }
 return  nums;




}}



