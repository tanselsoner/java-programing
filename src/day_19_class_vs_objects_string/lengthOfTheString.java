package day_19_class_vs_objects_string;

import javax.lang.model.SourceVersion;

public class lengthOfTheString {
    public static void main(String[] args) {
        String word ="Java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count " + word.length());
        System.out.println("wodden spoon ".length());
        String firstName = "Tansel";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password ="abc123";
        // ** if statement:
        //when password is at least 6 characters:
        // print: valid amazon password
        //else
        // password too short
        if(password.length()>=6){
            System.out.println("Valid Amazon Password");
        }else{
            System.out.println("Password Too Short");
        }

    }
}
