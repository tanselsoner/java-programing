package day_23_string_manipulations_while_loop;

public class smsmessage {
    public static void main(String[] args) {
        String message=" Sender:[saim]From number<+1222-333-4444> Message:{hello ,lets code java}";
       int start =message.indexOf("[") ;
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1,end));
        String sender =message.substring(start+1,end);
        System.out.println("sender ="+sender);
        String mobile = message.substring(message.indexOf("<") +1,message.indexOf(">") );
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{"),message.indexOf("}"));
        System.out.println("text = " + text);
        System.out.println("\t fikret\t ".trim());
        sender=sender.trim();
        if (sender.equals("saim")){
            System.out.println(("Message from saim about homework"));}
        else{
            System.out.println("someone else message");
        }

    }
}
