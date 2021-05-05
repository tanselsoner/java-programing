package day_16_switchStatements;

public class switchFloorSelector {
    public static void main(String[] args) {
        int floorNum=1;
        switch(floorNum){
           case 1:
         System.out.println("Floor 1 selected.Companies : Verizon,Starbucks");
            break;//exit switch
            case 2:
            System.out.println(" Floor 2 selected Companies :Cybertek,Intelset");
            break;
            case 3:
            System.out.println(" Floor 3 selected Companies: Lyft, Bofa ");
            break;
            default:
                System.out.println("Invalid floor - "+ floorNum);
                break;}


    }
}
