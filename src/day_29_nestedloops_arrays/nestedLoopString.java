package day_29_nestedloops_arrays;

public class nestedLoopString {
    public static void main(String[] args) {
        String word="java";
        for(int t=0; t<word.length();t++){
            for(int j=t; j<t; j++){  //j<=t

            System.out.print(word.charAt(j));}
            System.out.println();//new line after inner loop
        }
    for(int t=0; t<word.length();t++){
        for(int j=t; j<word.length(); j++){
            System.out.print(word.charAt(j));
            System.out.println();
        }}
    }}
