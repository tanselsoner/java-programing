package day_51_inheritance.super_keyword;

public class LyftRides {

    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXlRide = new LyftXL();
        Lux luxRide = new Lux();
        System.out.println("lyftRide for 5 miles = $" + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide for 5 miles = $" +  lyftXlRide.calculateRate(5));
        System.out.println("luxRide for 5 miles = $" + luxRide.calculateRate(5));



    }
}
