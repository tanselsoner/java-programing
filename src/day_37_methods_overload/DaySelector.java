package day_37_methods_overload;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));
        //
        for(int i=1;i<9;i++){
            System.out.println(i+" = "+getDayName(i));
        }
        //store getDayName into variable,and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay=getDayName(0);
        if(someDay == null){
            System.out.println("someDay is null for invalid day");
        }
    }
    public static String getDayName(int day) {
        String dayName = null;
        switch (day) {
            case 1: dayName = "Monday"; // we dont use break and return in same time
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
                break;
            case 5: dayName = "Friday";
                break;
            case 6: dayName = "Saturday";
                break;
            case 7: dayName = "Sunday";
                break;
            //default: return "Invalid day";
            default:
                System.out.println("Invalid - " +day);

        }return dayName;
    }
}
