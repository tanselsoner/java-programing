package day_28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source ="ABCDEFGHIJKLMOPRSTUVWQYZabcdefghijklmnoprstuvyz1234567890@#$%^&*";
        Random random = new Random();
        String password="";
        for(int i=1; i<=8; i++){
            int index=random.nextInt(60);
            System.out.print(source.charAt(index));
            //source.substring(index,index+1);
           // System.out.println(random.nextInt(source.length()));
            password+= source.charAt(index);

        }
        System.out.println(" \n Your password = " + password);

    }
}
