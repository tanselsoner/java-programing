package day_46_encapsulation;

public class dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //error when its private(year model) it is only accessible in same class
        //can not be accessed in different class
        // car1.model = "Nissan Altima";
       // car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1 mileage= " + car1.getMileage());

        System.out.println(car1.toString());
        //automatically calls to String
        System.out.println(car1);
        System.out.println();

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16684);
        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println(alfaRomeo);


    }
}
