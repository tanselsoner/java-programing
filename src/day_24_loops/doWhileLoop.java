package day_24_loops;

public class doWhileLoop {
    public static void main(String[] args) {
        int counter =0;
        do{
            System.out.println("counter = " + counter);
            counter+=100;//+=
        }while(counter<=1000);
    }
}
