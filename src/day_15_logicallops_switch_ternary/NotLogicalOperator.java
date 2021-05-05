package day_15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true =" +(!true));
        System.out.println("!false = " +(!false));
        int age = 2;
        // if ae is not mote than 7 print "need to sit in child car seat age
        if(!(age>7 )){
            System.out.println(" Need to sit in car seat " + age );
        }else {
            System.out.println("can sit normal seat age = " + age);
        }

        boolean isSmokingAllowed =false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println("Item Not affordable ");
        }else{
            System.out.println("Item is affordable");
        }
        String env ="qa";
        if(!env.equals("qa")){
            System.out.println("In wrong enviroment for QA testing");
        }
        String carModel = "ford";
        if (!carModel.equals("Tesla")){
            System.out.println("not interested");
        }
        String secretPasword ="abc123";
        String inputPassword ="abc321";
        if(!inputPassword.equals(secretPasword)){
        System.out.println("incorrect pasword");}

    if(!inputPassword.equals("abc123")){
        System.out.println("correct pasword");}else{
        System.out.println("incorrect pasword");
    }
}}
