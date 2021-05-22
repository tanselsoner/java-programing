package day_45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " +myCoffee.getAmount());
        //myCoffee.type ="Turkish coffe"; instead using method:
        myCoffee.setType("Turkish coffee");
        System.out.println("my Coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());
        Coffee coffee1=new Coffee();
        coffee1.setType("cappucinno");
        System.out.println("coffee1 type = " +coffee1.getType());
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("espresso");
        Coffee coffee3=new Coffee();
        coffee3.setType("frappucino");
        //point same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());
        Coffee coffee4= null;//reference variable does not refer
       coffee4.setType("Turkish");//null pointer exception

    }
}
