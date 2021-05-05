package day_17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 45;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 35) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println(" not eligible for free shipping ");
            }

        }
    }
}