package day_35_Methods_with_param;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("tansel","verizon");
        buildEmail("Tansel","gmail");
        buildEmail("john_ward_III","verizon");
        buildEmail("murodil","cybertekschool");

    }
    public static void buildEmail(String name,String domain){
        name=name.replace(" ","_").toLowerCase();
        domain=domain.toLowerCase();
        String Email=name+"@"+domain+"com";
        System.out.println("New Email " +Email);
    }
}
