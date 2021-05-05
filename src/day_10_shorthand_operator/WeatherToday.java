package day_10_shorthand_operator;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System . in);
        System.out.println("How is the weather today ? ");
        String weather = scan.nextLine();
        //String weather =scan.next() only accept till first space
        System.out.println(weather +" is a nice day today");

    }
}
