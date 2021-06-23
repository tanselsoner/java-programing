package day_56_Abstraction.driveable;

import day_56_Abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Flying people one city to another");

    }

    @Override
    public void cost(double mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to fly " + mile + " miles");


    }


    @Override
    public void autoPiloting() {
        System.out.println("Plane is flying on auto-pilot mode");

    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");

    }

    @Override
    public void bye() {
        System.out.println("Thank you for flying with us");

    }

    public void land() {
        System.out.println("Plane is landing _buckle uo");
    }
}
