package day_24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode=1234;
        int pinCode;//declare here so it can be visible for while condition

        do{
            System.out.println("Enter pin code");
            pinCode=scan.nextInt();
        }while(pinCode!=secretPincode);
        System.out.println("welcome to your account");

    }
}
