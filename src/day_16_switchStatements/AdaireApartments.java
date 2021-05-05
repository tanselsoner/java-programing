package day_16_switchStatements;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println(" ##### Welcome Adaire###");
        int bedrooms=5;//1 2
        int price = 1454;//1725,2899
        switch (bedrooms){
            case 0:
                System.out.println("studio appartment selected");
                price =1454;
                break;
            case 1:
                System.out.println(" one bedroom selected");
                price=1725;
                break;
            case 2 :
                System.out.println("Two bedroom selected");
                price = 2899;
                break;
            default:
                System.out.println(" we dont have that selection");
            //return;exit main method
        }
        System.out.println("price is = " +price);


    }
}
