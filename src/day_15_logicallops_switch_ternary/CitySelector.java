package day_15_logicallops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Bishkek";
        //Adana or Bishkek
        if(city. equals ("Adana") || city.equals("Bishkek")){
            System.out.println("willing to relocate to " + city);
        }else{
            System.out.println( "not considering  -" + city);
        }
        String teacher ="Nadir";
        // saim muradil java
        //otherwise soft skill with nadir
        if(teacher.equals("Saim") || teacher.equals("Muradil")){
            System.out.println(" it is a java class with " + teacher);
    }else{
            System.out.println(" soft skill class with " + teacher);
        }
        if(teacher.equals("Saim") || teacher.equals("Muradil")){
            System.out.println(" it is a java class"+ teacher);}else if( teacher. equals("Nadir")){
            System.out.println(" soft skill class  with" + teacher);
        }else{
            System.out.println("some class" +teacher);
        }
        //company "google",salary>=100k
        String company = "Amazon";
        double salary = 85_000.0;
        if (company.equals("Amazon") || salary>=100_000.0){
            System.out.println("accept the offer from " + company);}
        else {
            System.out.println(" dont accept offer from " + company);
        }
}
}
