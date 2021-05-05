package day_13_conditional_statements;

public class stringcomparison {
    public static void main(String[] args) {
        String city = "Adana";
        if (city=="Fairfax"){
            System.out.println("it is Fairfax");
        }else{
            System.out.println("it is somewhere else");
        }
        //String city ="Adana";
        if(city.equals("Adana")){
            System.out.println("it is Adana");
        }else{
            System.out.println("it is not Adana");
        }
        String weather ="sunny";
       // if (weather=="sunny"){it works but avoid
        if (weather.equals("sunny")){
            System.out.println("lets go out and code java");
        }else{
            System.out.println("lets stay indoors and code java");
        }

    }
}
