package day_19_class_vs_objects_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("Intell"));//case sensitive
        System.out.println(word.endsWith("ea"));
        String name ="Irina";
        if(name.endsWith("a")){
        System.out.println("maybe it is a female name");}

        String firstName ="Mr. James";
        if(name.startsWith("Mr.")){
            System.out.println("Man");
        } else if(firstName.startsWith("Dr.")){
            System.out.println("Doctor-"+ firstName);}
        else if (firstName.startsWith("Mrs.")){
            System.out.println("Misses-"+firstName);
        }

    }
}
