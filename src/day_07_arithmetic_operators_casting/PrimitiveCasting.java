package day_07_arithmetic_operators_casting;

public class PrimitiveCasting {public static void main(String[] args){
    // in order to make it work we need to cast it
    int num1=100;
    byte b1=(byte)num1;
    short shNum1=(short)num1;
    long lnum1=num1;
    //(byte)n1, will CAST/CONVERT n1 to byte then assign value
    System.out.println(num1);
    System.out.println(b1);
    System.out.println(shNum1);
    System.out.println(lnum1);
}
}
