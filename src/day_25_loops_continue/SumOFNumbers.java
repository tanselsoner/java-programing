package day_25_loops_continue;


public class SumOFNumbers {
    public static void main(String[] args) {
        int sum = 0;
        //1-5
        for (int i=1; i <= 100; i++){

           System.out.println(i);
           sum += i;
        }
        System.out.println("sum = " + sum);

    }
}
