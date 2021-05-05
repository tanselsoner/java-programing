package day_18_conditions_practice_string_intro;

public class fizzBuzz {
    public static void main(String[] args) {
        int number=15;
        if(number % 3 == 0 && number%5 ==0){
            System.out.println(" Fizz Buzz");}
        else if ( number %3 == 0){
            System.out.println("Fizz");
        }else if (number % 5==0){
            System.out.println(" Buzz");
        } else {
        System.out.println("number");}

        }
    }

