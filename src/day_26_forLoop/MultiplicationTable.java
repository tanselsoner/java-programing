package day_26_forLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n =8;
        if(n<1 || n>10){
            System.out.println("invalid input");
            return;//exit main method/stop the program
        }
        for(int i=1; i<=10;i++){
            System.out.println(n+" X " +i+ " = "+n*i);
        }
    }
}
