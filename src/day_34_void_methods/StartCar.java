package day_34_void_methods;

public class StartCar {
    public static void main(String[] args) {
     seatInCar();
     startTheCar();
     ShiftToDrive();
     pressGasPedal();
    }
    public static void seatInCar(){
        System.out.println("1.open the door and sit in driver seat");
    }
    public static void startTheCar(){
        System.out.println("2.Insert key to Ignition+turn clockwise");
    }public static void ShiftToDrive(){
        System.out.println("3.Press break pedal and shift to 'D");
    }public static void pressGasPedal(){
        System.out.println("4.Hold steering wheel with two hands and press gas pedal");

    }


}
