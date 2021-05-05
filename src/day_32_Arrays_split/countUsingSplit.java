package day_32_Arrays_split;

import java.util.Arrays;

public class countUsingSplit {
    public static void main(String[] args) {
        String catsTypes ="tekir cat van cat siamese cat stray cat ";
        String[]catsArray=catsTypes.split("cat");
        System.out.println(Arrays.toString(catsArray));
        System.out.println("number of cats = " +catsArray.length);
        for(String type:catsArray){
            System.out.println(type);

        }

    }
}
