package day_12_boolean_conditional_statements;

public class comparechars {
    public static void main(String[] args) {
        char letter1 ='A';
        char letter2 ='J';
        System.out.println(letter1 == letter2);//65==74 check if equal
        System.out.println(letter1 > letter2);//65>74check if A>B
        System.out.println(letter2 > letter1);//74>65check if B>A

        char grade ='E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);



    }
}
