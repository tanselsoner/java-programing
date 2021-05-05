package day_36_methods_with_string;

public class calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = "+ calculator.add(10,45));
        System.out.println("add 10*45 = "+ calculator.multiply(10,45));
        System.out.println("add 10-45 = "+ calculator.minus(100,40));
        System.out.println("add 10/45 = "+ calculator.divide(100,40));
        double d1=234.3;
        double d2=321.5;
        double result=calculator.minus(d1,d2);
        System.out.println("result = " + result);
    }
}
