package day_23_string_manipulations_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while(i<=25){
            System.out.println(i);
            i++;
        }
        int apples=0;
        while(apples<=3){
            System.out.println("apple-->" +apples);
            apples++;

        }
        System.out.println("apples = " + apples);

        //infinite loop
        while(true){
            System.out.println("Hello World");
        }
    }
}
