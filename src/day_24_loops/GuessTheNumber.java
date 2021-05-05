package day_24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       byte  secretNumber=45;
       byte guessingNumber=0;
       do{
           System.out.println("Guess the Secret number");
           guessingNumber=scan.nextByte();
           if(guessingNumber>secretNumber){
               System.out.println("wrong number too large");

           }if(guessingNumber<secretNumber){
               System.out.println("wrong number too small");
           }
       } while(secretNumber!= guessingNumber);
        System.out.println("Congratulations");

    }
}
