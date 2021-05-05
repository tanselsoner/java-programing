package day_36_methods_with_string;
import java.util.*;
public class personalInfo {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());

    }

    public static String fullName() {
        return "Tansel S. Yalbuzdag";
    }

    public static boolean isMarried(){
        return true;

    }

    public static int getAge() {
        return 46;
    }public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }


}
