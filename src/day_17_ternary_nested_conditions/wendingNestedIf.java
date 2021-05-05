package day_17_ternary_nested_conditions;

public class wendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem="tea";
        String snackItem="snack";
        if (selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drinkItem.equals("tea")){
                System.out.println("tea item is selected");
            }
        }else{
            System.out.println("coke item is selected");
        } if (selection.equals("snack")){
            System.out.println("snack option selected");if (snackItem.equals("chips")){
                System.out.println("chips option is selected");
            }else{
                System.out.println("candy option selected");
            }
        }
    }
}
