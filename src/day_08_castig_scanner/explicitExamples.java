package day_08_castig_scanner;

public class explicitExamples {
    public static void main(String[] args) {
    int num10 = 22;
    byte num11 = (byte) num10 ;
    short num12 = (short) num10;// cast/convert to smaller short
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);
        
        double num13= 55.3;
        float num14 =(float) num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);
        
        double num15 = 1234.5;
        int num16=(int)num15;
        System.out.println("num15 = " + num15);
        System.out.println("num16 = " + num16);
        int num17=300;
        byte num18=(byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);
                
    }
}
