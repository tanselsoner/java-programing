package day_22_String_Manipulations;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "resuly count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");//colon index 12
        System.out.println(result.substring(colonIndex+1));
        //we can combine them into 1 statement
        System.out.println(result.substring( result.indexOf(":")+1 ));
        String today = " i learned [history] today";
        int start =today.indexOf("[");
        int end =today.indexOf("]");
        System.out.println(today.substring(start+1,end));
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));




    }
}
