package day_46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc=new CheckingAccount();
        acc.setAccountNumber(1311534242);
        acc.setAccountHolder("mike smith");
        acc.setBalance(250.50);
        acc.setType("360");
        System.out.println(acc);
    }
}
