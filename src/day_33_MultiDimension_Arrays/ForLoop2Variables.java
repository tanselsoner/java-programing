package day_33_MultiDimension_Arrays;

public class ForLoop2Variables {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);
        }

        System.out.println("--------2 way for loop------");
        for (int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}

