package day_18_conditions_practice_string_intro;

public class switchSeasonFinder {
    public static void main(String[] args) {
        int month=6;
       // switch(month){
         //   case 12:
          //      System.out.println("Winter");
           //     break;
           // case 1:
             //   System.out.println("Winter");
             //   break;
           // case 2:
             //   System.out.println("Winter");
       //break; }
       //or logic with switch
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;}
            switch(month){
            case 3: case 4: case 5:
                System.out.println("spring");
                break;}
            switch(month){
            case 6: case 7:  case 8:
                System.out.println("summer");
                break;}
            switch(month){
            case 9: case10: case11:
            System.out.println("fall");
                break;
            default:
                System.out.println("invalid month  " + month);
                break;}


    }


    }

