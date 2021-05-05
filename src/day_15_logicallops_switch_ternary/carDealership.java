package day_15_logicallops_switch_ternary;

public class carDealership {
    public static void main(String[] args) {
        double budget =5000;
        String model="Tesla";
        double carPrice =4999.0;
        if (carPrice<= budget && model.equals ("Toyota")||model.equals("Honda")|| model.equals("Tesla")){
            System.out.println(" purchase model = " + model + " price =" + carPrice);
        }else{
            System.out.println("Not interested in model = " +model +  " ,price = " + carPrice);
        }
        }
    }

