package day_31_arrays;
import java.util.*;//Arrays
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums={9,0,7,-4,2,100,33,45};
        System.out.println(Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));
        System.out.println("min value " + nums[0]);
        System.out.println("max value "+nums[nums.length-1]);


        String[] words={"java","C#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ",words )+"]");
        //sort words in alph. order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        //sort words in reverse
        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));



    }
}
