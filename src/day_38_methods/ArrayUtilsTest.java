package day_38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[]nums={5,23,1,543,90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{45,78,9,0,8});

        System.out.println("sum= "+ ArrayUtils.sum(nums));
        System.out.println("sum= "+ArrayUtils.sum (new int[]{45,78,9,0,8}));
        int[]nums2={4,1,5,8};
        System.out.println("5 - found " +ArrayUtils.contains(nums2,5));
        System.out.println("10- found " +ArrayUtils.contains(nums2,10));



    }}

