package day_31_arrays;
import java.util.*;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        //this method helps search i array for value
        //array must be sorted for binary search to work
        int[]nums ={23,123,654,2344,12345,14421};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,25));
        System.out.println(Arrays.binarySearch(nums,700));
        System.out.println(Arrays.binarySearch(nums,-5));
        //check if num 12345 is in the array
        if(Arrays.binarySearch(nums,12345)>=0){
            System.out.println("12345 is in the array");
        }else{
            System.out.println("is not present");
        }

    }
}
