package day06_arithmetic_operations;

public class MoreMathOperators {public static void main (String[] args){
    int toyotas =431;
    int hondas =233;
    int VW = 2;
    int tesla =20;
    int nissan=1;
    int bmw=155;
     int totalCarsInParking =toyotas+hondas+VW+tesla+nissan+bmw ;
    System.out.println("There are "+ totalCarsInParking +  " cars In Parking Lot"  );
    String pizza =" hawaiian";
    int slices = 8;
    int people =4;
    int slicesPerPerson= slices/people;
    //there are 2 slices per person
    //we ordered hawaiian pizza with 8 slices ,4 people ate 2 slices each
    System.out.println("there are  " + slicesPerPerson  +  "slicesPerPerson ");
    System.out.println("we Ordered " +  pizza  +   " pizza with  "  +slices +  "slices,"
            +people +  "People ate " + slicesPerPerson + "slices each");
}
}
