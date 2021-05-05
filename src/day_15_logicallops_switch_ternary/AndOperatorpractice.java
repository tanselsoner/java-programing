package day_15_logicallops_switch_ternary;

public class AndOperatorpractice {
    public static void main(String[] args) {
        boolean onsale = true;
        boolean freeShipping = false;
        String itemName = "Wooden Spoon";
        if (onsale && freeShipping){
            System.out.println("adding to cart - " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

        //add to cart only when it is free shiping, onsale ,"wooden spoon"
       if(onsale && freeShipping && itemName.equals("wooden spoon")) {
           System.out.println("adding to cart - " + itemName);
       }else{System.out.println("Continue shopping for good deals on - " + itemName);

       }
    }
}
