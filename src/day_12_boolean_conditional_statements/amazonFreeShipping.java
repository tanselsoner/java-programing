package day_12_boolean_conditional_statements;
import java.util.Scanner;
public class amazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order total price");
        double totalPrice =scan.nextDouble();

        if (totalPrice >= 25.0){
            System.out.println("Free Shipping Eligible.your order total : $" + totalPrice);
        }else{
            System.out.println("not eligible for free shipping.your order total : $" + totalPrice);

        }
        System.out.println("THANKS FOR SHOPPING AMAZON");



    }
}
