package day_36_methods_with_string;

public class calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2,20));
       double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100+200= "+add(100,200));
        System.out.println(minus(10,3));
        System.out.println(multiply(2,10));
        System.out.println(divide(6,3));
    }
     public static double add(double num1,double num2) {
        double result=num1+num2;
        return result;
     }public static double minus(double num1,double num2){
        double result=num1-num2;
        return result;
    }public static double multiply(double num1,double num2){
        double result=num1*num2;
        return result;

        }public static double divide (double num1,double num2){
        double result=num1/num2;
        return result;
}}


