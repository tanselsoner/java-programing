package day_37_methods_overload;

public class daySelector2 {
    public static void main(String[] args) {
        System.out.println(getDayNamev2(2));
    }
    public static String getDayNamev2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "monday";
                break;
            case 2:
                dayName = "tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName = "thursday";
                break;
            case 5:
                dayName = "friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "sunday";
                break;
            default:
                System.out.println("invalid name=" + day);
                dayName = null;

        }
        return dayName;

    }
}
