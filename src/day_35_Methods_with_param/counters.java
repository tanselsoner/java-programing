package day_35_Methods_with_param;

public class counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        count(2);
        count(35);
        int num2=9;
        count(num2);
        String word ="wooden spoon";
        count(word.length());
        printAge(1975);
        printAge(1990);
        int birthYear=2001;
    }

        public static void count(int num){
        for(int i =0;i<=num;i++){
            System.out.print(i+" ");
        }
            System.out.println();
        }

        public static void printAge(int year){
        int age=2021-year;
            System.out.println("Birth year "+year+" Age "+(2021-year));
        }
}
