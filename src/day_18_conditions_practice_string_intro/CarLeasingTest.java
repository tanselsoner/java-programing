package day_18_conditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make ="Mercedes";
        String model ="E";
        Double leasePrice =500.0;
      //  if (make.equals("mercedes")&& model . equals("E")){
            leasePrice=500.0;
       // }
      //  else if(make.equals("Mercedes")&&model.equals("A"){
            leasePrice =400.0;
       // }
       if (make.equals("mercedes")) {if(model.equals("E")){
           leasePrice=400.0;
       }} else if (model.equals("A")) {leasePrice=400.0;}
       else{
           System.out.println("invalid make");}

       System.out.println("make= "+make);
        System.out.println("model = " +model);
        System.out.println("leasePrice = " + leasePrice);

    }
}
