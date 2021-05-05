package day_40_ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size= "+shoppingList.size());
        System.out.println("isempty? = "+shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("list is empty,keep coding java");
        }else{
            System.out.println("list is not empty,code java then go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("list is empty,keep coding java");
        }else{
            System.out.println("list is not empty,code java then go to mall");
        }
        int count=shoppingList.size();
        System.out.println("items to buy = "+count);
        System.out.println("is shoes in my list " +shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("shoes is in the list");
        }else{
            System.out.println("shoes is not there");
        }
        System.out.println("buying shoes...$80");
        shoppingList.remove("shoes");
        System.out.println("list = " + shoppingList);
        System.out.println("done shopping get back to coding");
        shoppingList.clear();//clear the list,remove all items
        System.out.println(shoppingList);
    }
}
