package day_19_class_vs_objects_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class stringcomparison {
    public static void main(String[] args) {
        String city ="Chicago";
        //equals() method-CASE SENSITIVE
        System.out.println(city.equals("Chicago"));//true
        System.out.println(city.equals("chicago"));//false
        System.out.println(city.equals("Chicago " ));//false
        //EQUALSIGNORECASE() METHOD CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("chicago"));//true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));//true
        System.out.println(city.equalsIgnoreCase("Chicago"));//true
        System.out.println(city.equalsIgnoreCase("chiiigo"));//false
        System.out.println(city.equalsIgnoreCase("chi cago"));//false

    }
}
