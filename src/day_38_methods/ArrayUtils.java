package day_38_methods;

public class ArrayUtils {
    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();

    }
    public static int sum(int[]nums){
        int sum=0;
        for(int num:nums){
            sum+=num;

        }
        return sum;

    }
    public static boolean contains(int[]nums,int num){
        int[]nums2={4,1,5,8};
        int num2=5;
        boolean found=false;
        for(int each:nums){
            if(each==num){
                found=true;
                break;
            }
        }return found;

}}
