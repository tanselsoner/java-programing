package day_29_nestedloops_arrays;

public class starsNestedLoop {
    public static void main(String[] args) {
        for(int s=1; s<=10; s++)
        {for( int k=1; k<30; k++){
            System.out.print("*");}

        System.out.println();}


    for(int outer=1; outer<=10;outer++){
        for(int inner=1;inner<=outer; inner++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

