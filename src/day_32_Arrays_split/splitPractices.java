package day_32_Arrays_split;
import java.util.*;
public class splitPractices {
    public static void main(String[] args) {
        String words="java-python-selenium-html";
        words.split("-");
        String[ ]wordsArray=words.split("-");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("lenght of Array = " +wordsArray.length);
        for(String each:wordsArray){
            System.out.println(each);
        }

        String sentence = "today is a beautiful day";
        sentence.split(" ");
        String[]sentenceArray=sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("number of words in sentence = "+ sentenceArray.length);
        System.out.println("first word :"+ sentenceArray[0]);
        System.out.println(sentence.split(" ")[3]);
        for(String each:sentenceArray){
            System.out.println(each);
        }




    }
}
