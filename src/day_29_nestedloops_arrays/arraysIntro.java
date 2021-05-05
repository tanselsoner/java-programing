package day_29_nestedloops_arrays;
//use it when you know size but values

public class arraysIntro {
    public static void main(String[] args) {
        int[] nums=new int[3];//new int[3]-->assign array //int[] array(multiple)variables
        nums[0] =5;
        nums[1] =10;
        nums[2] =7;
       // nums[3] =100;//array index out of bonds arrays are not resizable
        System.out.println("value at index 0 = " + nums[0]);//index0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);
        //we can also use int variable to specify index number
        int i=0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);
        //how to find out the size of array.
        System.out.println("number of elements = "+ nums.length);
        //store lenght of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);
        //change values in the array
        nums[0]=100;
        nums[1]=300;
        nums[2]=nums[1];
        System.out.println("value at index 0 = " + nums[0]);//index0
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);



    }
}
