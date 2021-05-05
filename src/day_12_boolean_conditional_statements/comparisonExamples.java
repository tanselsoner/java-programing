package day_12_boolean_conditional_statements;

public class comparisonExamples {
    public static void main(String[] args) {
        int speedLimit=5_5;//55
        int currentSpeed=4_5;//45
        System.out.println(currentSpeed>speedLimit);//false 45 NOT MORE 55
        System.out.println(speedLimit<currentSpeed);//FALSE 55 NOT LESS 45
        System.out.println(speedLimit ==  currentSpeed);//FALSE 55 NOT EQUAL45

        boolean isSpeeding=currentSpeed>speedLimit;
        System.out.println("Are you speeding? -" + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +" mph");
        System.out.println("SpeedLimit = " + speedLimit+" mph");
        //45+20=65
        currentSpeed += 20;//65
        isSpeeding= currentSpeed>speedLimit;
        System.out.println("Are you speeding? -" + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed +" mph");
        System.out.println("SpeedLimit = " + speedLimit+" mph");

        double accountBalance=250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford ?_ " +(accountBalance>=itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);
        //decrease balance by itemprice. using shorthand operator
        accountBalance = accountBalance-itemPrice;
        accountBalance-=itemPrice;
        boolean isBroke =accountBalance<=0;
        System.out.println("Am I broke? - " + isBroke);




    }
}
