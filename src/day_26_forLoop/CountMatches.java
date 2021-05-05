package day_26_forLoop;

public class CountMatches {
    public static void main(String[] args) {
        String word="adana";
        char letter='a';
        int count=0;
        for (int i=0;i<word.length(); i++){
            if(word.charAt(i)== letter){count++;}
        } System.out.println("there are " + count+" "+letter+"'s in " + word);
    }
}
