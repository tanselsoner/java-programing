package day_18_conditions_practice_string_intro;

public class authentication {
    public static void main(String[] args) {
        int expLast4SSN =1235;
        int expPinCode =4322;
        int last4SSN =1234;
        int pinCode = 4321;
        if(last4SSN ==expLast4SSN  && pinCode ==expPinCode){
            System.out.println("Authentication succesfull");
        }else {
            System.out.println("Authentication unsuccesfull");
            if(last4SSN!=expLast4SSN){
                System.out.println("Last 4 SSN number is incorrect");}
            if (expPinCode!= pinCode){
                System.out.println("Pin Code is incorrect");
            }

          }


    }
}
