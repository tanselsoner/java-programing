package day_14_Multi_branch_if_statements;

public class multiBranch {
    public static void main(String[] args) {
        int day=3;
        if (day==1){
            System.out.println(("Monday"));
        }else{
            System.out.println("Not Monday");
        }
        if (day==2){
            System.out.println("Tuesday");
        }if (day==3){
            System.out.println("Wednesday");
        }
        System.out.println("MULTI BRANCH IF STATEMENT");
        day=2;
        if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if (day==3){
            System.out.println("wednesday");
        }else{
            System.out.println("java day");
        }
        System.out.println("Everyday code java");

        }

    }

