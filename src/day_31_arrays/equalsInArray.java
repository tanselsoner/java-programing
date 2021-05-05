package day_31_arrays;
import java.util.*;
public class equalsInArray {
    public static void main(String[] args) {
        //accepts 2 arrays of same type returns true:
        //if arrays are same lenght and have same data in same order
        //otherwise returns false
        int[]nums1={4,12,53};
        int[]nums2={4,12,53};
        int[]nums3={10,4,5,2};
        int[]nums4={4,5,2,10,90};
        int[]nums5={4,9,0,2,23,32};
        System.out.println("nums1==nums2 -"+Arrays.equals(nums1,nums2));
        System.out.println(nums1==nums2);
      // String[]cars1=("Toyota","Honda","Tesla","Bmw","Dodge");
       // String[]cars2=("Toyota","Honda","Tesla","Bmw","Dodge");
       //String[]cars3=("toyota" ,"Honda","Tesla","Bmw","Dodge");
    }
}
