package day_19_class_vs_objects_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        //"usa"
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("Pass -case is correct");
        } else {
            System.out.println("Fail - case is incorrect");
        }
    }
}