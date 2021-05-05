package day_16_switchStatements;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size ="grande";//grande venti
        double price = 3.69;//3.99 4.29
        int calories = 90;// 120 150
        switch (size){
            case "tall":
                System.out.println("tall cappucino please");
                price=3.69;
                calories=90;
                break;
            case "grande":
                System.out.println("grande cappucino please");
                price=3.99;
                calories=120;
                break;
            case "venti":
                System.out.println("venti capuccino please");
                price=4.29;
                calories=150;
                break;
            default:
                System.out.println("we dont have  " + size +" cappucino");
               break; //if you put default at end break is optional


        }
        System.out.println("total price");
        System.out.println("you will consume "+ calories+ " energy");





    }
}
