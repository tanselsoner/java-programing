package day_13_conditional_statements;

public class IFWithBooleanvariable {
    public static void main(String[] args) {
        boolean isHungry =false;
        if (isHungry==true){
            System.out.println("I am hungry i will go get something to eat");
            System.out.println("Then code Java");
    }else {
            System.out.println("I am not hungry lets keep coding java");
      }


        double price =130.44;
boolean isAffordable = price<=200;//200 is budgetprice 130.44 is affordable
        System.out.println("is Affordable =" + isAffordable);
        if (isAffordable){
            System.out.println("i can afford it ,lets buy");
        }else{
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isremoteJob = true;
        //if it is not remote job print "sorry I am not interested"
        // otherwise, print "sure I am interested, what is the interview process?"
        //if(isRemoteJob!=true){
        //if(isRemoteJob==false){
        if (isremoteJob!=true){
            System.out.println("sorry i am not interested ");
        }else{
            System.out.println("sure i am interested,what is interview process?");
        }
 }
}



