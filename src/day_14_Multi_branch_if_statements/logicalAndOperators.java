package day_14_Multi_branch_if_statements;

public class logicalAndOperators{
    public static void main(String[] args) {
    System.out.println(true&&true);//true
    System.out.println(true&& false);//false
    System.out.println(false&&true);//false
    System.out.println(false&&false);//false

        System.out.println(10 > 5 && 1 ==1);//true true+true=true
        System.out.println(99 < 100 && 22> 25 );//false
        System.out.println(3 < 2 && 5 >2 );//false
        System.out.println(10 >15 && 5>10);//false
       int apples = 10, oranges = 5;
       boolean check = apples<5 && oranges< 3;
        System.out.println("check = "+ check );
        if(apples>6 && oranges > 1){
            System.out.println(" I have enough");
        }else {
            System.out.println(" i need to buy more");
        }



}
}
