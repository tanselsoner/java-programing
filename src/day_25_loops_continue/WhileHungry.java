package day_25_loops_continue;

public class WhileHungry {
    public static void main(String[] args) {


    boolean IsHungry = true;
    int bananas = 0;
    int countToFull=3;
    while (IsHungry) {
        bananas++;
        System.out.println("eating a banana" +bananas);
       // IsHungry=bananas==countToFull?false:true;
   if(bananas==countToFull){IsHungry=false;}
                }
        System.out.println("had enough bananas,continue study");

}
}
