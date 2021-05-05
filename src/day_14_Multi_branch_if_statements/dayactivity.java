package day_14_Multi_branch_if_statements;

public class dayactivity {
    public static void main(String[] args) {
        String weather="warsunny";
        if(weather.equals("sunny")){
            System.out.println("go to park");
        }else if(weather.equals("rainy")){
            System.out.println(weather+ "- stay home,code java");
        }else if(weather.equals("snovy")){
            System.out.println(weather + "- make a snowman");
        }else if(weather.equals("windy")){
            System.out.println(weather+"- get ready for pover loss");
        }else{
            System.out.println("keep coding java");
        }

    }
}
