package day_45_oop;

public class Coffee {
    @Override
    public String toString() {
        return "Coffee{" +
                "getType='" + getType + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public String getType;
    // can be 0-100 as percentage
    int amount;
    String type;
    public void refill(){
        amount=100;
    }
    public void drink(int someAmount){
        amount-=someAmount;

    }
    public int getAmount(){
        return amount;}
     public void setType(String newType) {
        type=newType;
     }
     public String getType(){
        return type;
     }


    }


