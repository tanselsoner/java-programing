package day_32_Arrays_split;

public class sentenceSplit {
    public static void main(String[] args) {
        String sentence="java is fun";
        String[]words=sentence.split(" ");
        System.out.println("1st word = " +words[0]);
        System.out.println("2nd word = " +words[1]);
        System.out.println("3rd word = " +words[2]);
        for(String w: words){
            System.out.println(w);}

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[]result=googleResult.split(" ");
        System.out.println("count = " + result[1]);
        System.out.println("count = " + result[4]);

    }
}
