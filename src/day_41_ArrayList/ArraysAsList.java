package day_41_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);
       // nums.add(100);
        //nums.remove(0);
        //nums.clear();
        // if you put arrays as list you can not add or remove or clear
        
        
        List<Integer>numsList = new ArrayList<>(Arrays.asList(2,4,4,23,5344,100));
        numsList.add(33);
        numsList.add(56);
        numsList.add(82);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);


        List<String>drinksWithCaffeine=new ArrayList<>(Arrays.asList("cofee","tea","monster","red bull","coke","pepsi","mdew","kambucha","celcius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount =0;
        for(String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celcius")) {
                caffeineAmount = 150;
                System.out.println(drink + "--> " + caffeineAmount);

            } else if (drink.equals("cofee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + "--> " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;

                System.out.println(drink + "--> " + caffeineAmount);
            }

        }
        System.out.println();

     for(String drink: drinksWithCaffeine){
         switch (drink){
             case"monster" : case"red bull": case"celcius":
                 caffeineAmount=150;
                 System.out.println(drink+ "--> "+caffeineAmount);
                 break;
             case"cofee":case"kambucha":
                 caffeineAmount=112;
                 System.out.println(drink+ "--> "+caffeineAmount);
                 break;
             case"tea": case"coke": case"pepsi": case"mdew":
                 caffeineAmount=35;
                 System.out.println(drink+ "--> "+caffeineAmount);
                 break;
         }
     }
     drinksWithCaffeine.forEach( drink-> System.out.println());
     drinksWithCaffeine.forEach(each->{
         System.out.println("--------------");
         System.out.println("each = " + each);
         System.out.println("--------------");

     });
        
    }
}
