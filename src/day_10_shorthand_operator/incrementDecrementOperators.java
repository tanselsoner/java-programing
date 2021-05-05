package day_10_shorthand_operator;

public class incrementDecrementOperators {
    public static void main(String[] args) {
        // num=num+1;
        // num+=1;
        // num++;
        //++num;
        int i =1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
       // i--;
        //--i;
       // System.out.println("i = " + i);
        int linesOfCode =15;
        System.out.println("linesOfCode = " + linesOfCode);
        // increase by 1 3 different ways
        linesOfCode++;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode=linesOfCode +1;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode+=1;
        System.out.println("linesOfCode = " + linesOfCode);
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode =linesOfCode-1;
        linesOfCode -=1;
        --linesOfCode;
        linesOfCode--;
        System.out.println("linesOfCode = " + linesOfCode);
        char letter ='a';
        System.out.println("letter = " + letter);
        letter++;//change to next character
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        letter--;
        letter--;
        letter--;
        System.out.println("letter = " + letter);
                

        
    }
}
