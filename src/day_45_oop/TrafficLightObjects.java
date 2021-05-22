package day_45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic lights object
        TrafficLight trafficLight =new TrafficLight();
       // trafficLight.color ="red" NOT THIS WAY TODAY
        // will assign/update the value of color using a method class
        trafficLight.changeColor(("red"));
        //System.out.println("currentcolor=" +trafficLight.color);direct acces to variable
        //call method to access the variable
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("brown");
        trafficLight2.showColor();





    }
}
