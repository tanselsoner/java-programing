package day_15_logicallops_switch_ternary;

import java.sql.SQLOutput;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade ='D';
        if (grade== 'A'|| grade=='B'|| grade=='C'){
            System.out.println(" Passes with grade " +  grade);
        }else if (grade=='D'){
            System.out.println(" Qualify for retake grade is  "+ grade);
        }else if(grade=='F'){
            System.out.println("fail grade is  "+grade);
        }else{
            System.out.println(" invalid grade");
        }



    }
}
