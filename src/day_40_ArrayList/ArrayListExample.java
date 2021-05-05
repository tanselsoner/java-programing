package day_40_ArrayList;
import java.util.*;
//import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java")error bc we specified the type

        System.out.println("size = "+nums.size());
        //reading from array list
        System.out.println("index 0 = " +nums.get(0));
        System.out.println("index 1 = " +nums.get(1));
        System.out.println("index 2 = " +nums.get(2));
        //System.out.println("index   = "+ nums.get(3));indexOutOfBoundsException
        System.out.println(nums);//Arrays.toString(numArray)
        nums.remove(1);//remove element at index 1
        System.out.println(nums);


    }
}
