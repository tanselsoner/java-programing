package practiceIfStatements;
import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("enter your score");
        int grade = scan.nextInt();
        System.out.println("Enter the attempt:");
        int attempt = scan.nextInt();
        if (attempt == 1) {
            System.out.println("grade is "+(grade - grade * 0.1));
        }else if (attempt==2){
            System.out.println("grade is "+(grade - grade * 0.2 ));

        }else if (attempt == 3){
            System.out.println("grade is "+(grade- grade *0.3));
        }

        }

    }

