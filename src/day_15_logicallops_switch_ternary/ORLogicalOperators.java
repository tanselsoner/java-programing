package day_15_logicallops_switch_ternary;

public class ORLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true|| true= " +(true || true));
        System.out.println("true|| false ="+(true || false));
        System.out.println("false|| true = " +(false || true));
        System.out.println("false || false ="+(false||false));

        int apples =5;
        int oranges=7;
        System.out.println(apples > 3 ||oranges > 4);
        if (apples> 3 || oranges > 4){
            System.out.println("no need to buy any fruits");

        }else{
            System.out.println("need to buy some fruit");
        }
        System.out.println(apples >2 ||oranges >10);
        System.out.println(apples >2 && oranges >10);
        if(apples == 0 || oranges ==0){
            System.out.println("buy some fruits");
        }else{
            System.out.println("we are good");
        }

    }
}

