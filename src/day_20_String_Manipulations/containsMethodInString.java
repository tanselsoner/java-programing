package day_20_String_Manipulations;

public class containsMethodInString {
    public static void main(String[] args) {
        String company= "Capital one";
        System.out.println(company.contains("i"));//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("on"));//true
        System.out.println(company.contains("tlo"));//false(not together)
        System.out.println(company.contains("cap"));//false(case sensitive)
        //if company contains space print "multiple words company name"
        //else"single word company name
        if(company.contains(" ")){
            System.out.println("multiple words company name");}
        else{
            System.out.println("single word company name");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | "is in etsyTitle
        if(etsyTitle.contains(" | ")){
            System.out.println("Pass-title check passed");
        }else{
            System.out.println("Fail-title check failed");
        }
        String firstName= "Tansel";
        //check if firstName contains "a","e"
        if(firstName.contains("a")&& firstName.contains("e")){
            System.out.println("both a && e are present");}else{
            System.out.println("a|| e not present");
        }
        firstName="Nadir";
        if(firstName.contains("a")|| firstName.contains("i")){
            System.out.println("it contains both");
        }else{
            System.out.println("it does not contain");
        }
        String email= "tanselsoner@hotmail.com";
        //chek if email contains @ and ens with .com
        if(email.contains("@")&& email.endsWith(".com"))
        { System.out.println("valid email");}else{
            System.out.println("invalid email");
        }
        if(email.toLowerCase().contains("d")){
            System.out.println("d is present");}
        else{
            System.out.println("no d ");
        }
    }
}
