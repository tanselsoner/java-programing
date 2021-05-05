package day_23_string_manipulations_while_loop;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String word="woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove spaces first than print everything upper case
        System.out.println(word.replace(" ","").toUpperCase());
        String city="BISHKEK";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized =(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        System.out.println("capitalized= "+ capitalized);
        //city.isEmpty().toUpperCase() does not work since is Empty is boolean

    }
}
