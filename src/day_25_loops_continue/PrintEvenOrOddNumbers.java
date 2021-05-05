package day_25_loops_continue;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS");
        for(int n =0; n<=100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        } System.out.println(" ODD NUMBERS");
        for(int j=0; j<=100; j++){
            if (j %2 !=0 ){
            System.out.print(j + " " );}
        }
    }
}
