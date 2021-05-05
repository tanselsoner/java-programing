package day_17_ternary_nested_conditions;

public class moreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate>45)? "accept":"reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher=(todaysClass.equals ("java"))?"saim|murodil" :"nadir";
        System.out.println(" Today's teacher = " + teacher);

        boolean isEligibleToDrive=false;
        String driving= isEligibleToDrive ?" yes have DL , can drive" :"no DL cannot drive";
        //"have DL , can drive" "no DL cannot drive"
        System.out.println("driving = " + driving);
    }
}
