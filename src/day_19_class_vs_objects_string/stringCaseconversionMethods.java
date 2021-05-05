package day_19_class_vs_objects_string;

public class stringCaseconversionMethods {
    public static void main(String[] args) {
        String word ="Cybertek";
        String sentence ="Java is fun";
        System.out.println(word);
        System.out.println(sentence.toLowerCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(sentence.toUpperCase());
        //change word to all lower case letters
        word=word.toLowerCase();
        System.out.println("word = " + word);
        String company="Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        //change variable company "Amazon" to"AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }
}
