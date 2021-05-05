package day_28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word ="javva";
        String unique="";
         for(int n =0; n <word.length(); n++){
             //if word.charAt(n)is not contains in unique
             //System.out.println(word.charAt(n));
             if(!unique.contains(word.charAt(n)+"")){unique+= word.charAt(n);}


         }
        System.out.println(unique);
    }
}
