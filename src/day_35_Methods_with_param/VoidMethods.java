package day_35_Methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        System.out.println("The English Alphabet consists of 26 letters:" );
        printAtoZ ();
        printAtoZ ();

        for (int i= 0; i< 10; i++) { printAtoZ ();

        }
        displayUSFlag();
    }
     // A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.
        public static void printAtoZ () {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i + " ");


            }
            System.out.println();

            }public static void displayUSFlag() {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }


        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

    }
}

