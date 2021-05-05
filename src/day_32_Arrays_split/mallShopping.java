package day_32_Arrays_split;

public class mallShopping {
    public static void main(String[] args) {
       String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
       double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
       int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("-------FIND THE INDEX OF 'Gloves' in items array-----");
        //use for loop with condition
        for(int n=0; n<items.length;n++){
            if(items[n].equals("Gloves")){
                System.out.println("Gloves found at index " + n);
                break;
            }

           // System.out.println(n+" - "+items[n]);
        }
        System.out.println("-----Set boolean to true if first 'iPad' is found------");
        boolean iPadExists=false;
        for(String item: items){if(item.equalsIgnoreCase("iPad")){
        iPadExists=true;
        break;}
        }
        System.out.println("iPadExists = "+iPadExists);
        System.out.println("-----Print a report of each shopping item----");
        for(int n=0; n< items.length;n++){
            System.out.println(items[n] +" - $" +prices[n]+" - #"+itemIDs[n]);
        }

        System.out.println("---look for 'jacket' in items and print all details");
        for(int n= 0; n< items.length;n++){
            if(items[n].equalsIgnoreCase("jacket")){
                System.out.println(items[n] +"-$"+prices[n]+" - #"+itemIDs[n]);
            break;
            }
        }



    }
}
