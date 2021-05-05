package day_35_Methods_with_param;

public class methodsWithParam {
    public static void main(String[] args) {
        displayValue(50);
        displayValue(94);
        int count=55;
        displayValue(count);
        greetByName("Aaeesha");
        greetByName("Suleyman");


    }
        public static void displayValue(int num){
        System.out.println("value is " +num);
    }
    public static void greetByName(String name){
        System.out.println("hello "+name+" how are you");
    }


}
