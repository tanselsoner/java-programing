package day_09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents :");
        int cents= scan.nextInt();
        //int cents =57890
        int dollars= cents/100;
        int remainingCents= cents % 100;
        System.out.println("Cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("in " + cents + " cents  :  " + dollars  +  " dollars "  +remainingCents+ " cents");
        
        
        
    }
}
