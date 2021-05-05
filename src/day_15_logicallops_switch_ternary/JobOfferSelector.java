package day_15_logicallops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location ="Bishkek";
        double salary = 130_000.0;
        boolean isRemote = true;
        boolean benefits = true;
        if (location.equals("Bishkek") && salary >= 120_000.0 && isRemote && benefits){
            System.out.println("sure I will accept this offer");
        }else{
            System.out.println("lets consider another offer or negotiate");
        }
    }
}
