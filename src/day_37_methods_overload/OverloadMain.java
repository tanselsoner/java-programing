package day_37_methods_overload;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {
        System.out.println(" Hello From Real main method");
        main(10);
        Arrays.toString(args);
        System.out.println(Arrays.toString(args));
    }
    // overloading main method:
    //same name +different parameter
    //jdk does not look for this one to run

    public static void main(int num) {
        System.out.println("num= "+num);


    }

    public static void main(boolean b) {
        System.out.println();

    }
}
