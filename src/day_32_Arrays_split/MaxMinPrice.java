package day_32_Arrays_split;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        //find and print of most expensive
        //find and print of least expensive

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        System.out.println("--- find and print details  of most expensive item------- ");

        double maxPrice = 0;
        int maxIndex=0;

        for(int n=0;n < prices.length;n++){
            if(prices[n]>maxPrice){
                maxPrice=prices[n];
                maxIndex = n;
            }
        }
        System.out.println(" the most expensive item is "+
                items[maxIndex] +"- $ "+ prices[maxIndex] + " -#"+
                itemIDs[maxIndex]);
        System.out.println("");
        System.out.println();


        System.out.println("--- find and print details  of least expensive item------- ");
        double minPrice = prices[0];
        int minIndex=0;

        for(int n=0;n < prices.length;n++){
            if(prices[n]<minPrice){
                minPrice=prices[n];
                minIndex = n;
            }
        }System.out.println(" the least expensive item is "+
                items[minIndex] +"- $ "+ prices[minIndex] + " -#"+
                itemIDs[minIndex]);



    }
}
