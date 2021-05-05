package day_24_loops;
//count forward++
//countbackwards --
public class WhileLoopReverse {
    public static void main(String[] args) {
        int count= 5;
        while(count>=0){
            System.out.println("count = " +count);
            count--;
        }
        System.out.println("Finish the count");

        int unreadSMS =10;
        //read each msg 1 by 1 until u have 0 sms
        System.out.println("I have total " + unreadSMS + " unread sms");
        while (unreadSMS > 0){
            System.out.println("Reading SMS : " + unreadSMS);
        unreadSMS--;} System.out.println("Read all the mesages ");
    }
}
