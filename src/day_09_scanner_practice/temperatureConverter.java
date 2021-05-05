package day_09_scanner_practice;
import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // you can put scan,input name for variable
        System.out.println("***** F TO C CONVERTER****");
        System.out.println("Enter Fahrenheit value : ");
        double fahrenheitValue = input.nextDouble();
        double celciusvalue = (fahrenheitValue -32)* 5 / 9;
        System.out.println(celciusvalue);

    }
}
