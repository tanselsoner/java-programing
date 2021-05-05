package day_10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args) {
    double balance = 1230.55;
        System.out.println("balance = " + balance);
        double baklava =22.50;
        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava  = " + balance);
        double kunafe = 44.45;
        System.out.println("kunafe = " + kunafe);
        balance =balance-kunafe;
        System.out.println("balance after kunafe = " + balance);
        //second kunafe is 50 % off lets buy it
        kunafe = kunafe /2;
        System.out.println("kunafe = " + kunafe);
        //buy it and decrease balance with kunafe
        balance = balance - kunafe;
        System.out.println("balance after second kunafe =" +balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov = " + balance);
        
        double icetea = 3.00;
        System.out.println("icetea = " + icetea);
        //buy 4 ice teas and decrease balance
        balance = balance - icetea * 4;
        System.out.println("balance after 4 ice teas = $"+ balance);
        //return baklava
        System.out.println(" returning baklava = "+ baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava =" + balance);
        


    }
}
