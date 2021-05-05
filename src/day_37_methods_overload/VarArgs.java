package day_37_methods_overload;

public class VarArgs {//varargs

    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(23,45,67,89,90,4,5,7,98);
        addNumbers();
    }
    public static void addNumbers(int...nums){
        //inside the method it is used as regular array
        int sum = 0;
        for(int n: nums){
            sum+=n;
        }
        System.out.println("sum = " + sum);
    }
}
