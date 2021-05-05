package day_13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("*****Welcome To TD Bank ATM*****");
        int secretPincode=2233;
        int inputPincode=2233;

        if (secretPincode==inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw ,check balance, deposit");
        }else{
            System.out.println("incorrect pincode!"+inputPincode );
            System.out.println("please try again");
        }



    }
}
