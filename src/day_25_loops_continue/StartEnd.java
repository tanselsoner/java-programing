package day_25_loops_continue;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and End");
        int start =scan.nextInt();
        int end =scan.nextInt();
        if(start>end){
            System.out.println("reverse numbering is not supported");
        }
        for(int i= start;i<=end; i++){
            System.out.print(i+" ");
        }
}
}
