package day_10_shorthand_operator;

import java.security.spec.RSAOtherPrimeInfo;

public class shorthandOperators {
    public static void main(String[] args) {
    int cars =10;
        System.out.println("cars in parking lot=" +cars);
        cars =cars+2;
        System.out.println("cars in parking lot= " +cars);
        cars+=5;
        System.out.println("cars in parking lot = "+ cars);
        // 7 cars left
        //cars = cars -6;
        cars -= 6;
        System.out.println("cars in parking lot =" + cars);
        cars =cars-1;
        cars-= 1;
        System.out.println("cars in parking lot = " + cars);
        int electricCars =13;
        //cars = cars + electricCars;
        cars+= electricCars;
        System.out.println("cars in parking lot = " + cars);
        String word = "java";
        System.out.println("word = " + word);
        word = word +"programing";
        System.out.println("word = " + word);
        //add "is fun"
        word += " is fun";
        System.out.println("word = " + word);
        String selenium =" but \"selenium \"is more fun";
        word+= selenium;
        System.out.println("word = " + word);
        word +=12345;
        System.out.println("word = " + word);
        char letter ='A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 'j' to letter
        letter+=1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println(" normal parking Fee = " + parkingFee);
        //early bird 50 off
        //parkingFee = parkingFee /2;
        parkingFee /= 2;
        System.out.println("early parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println(" Weekend parking Fee = " + parkingFee);








    //n+= 3;
    //n=n+3;
    //both lines adds 3 to n



    }
}
