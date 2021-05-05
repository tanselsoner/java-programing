package day_20_String_Manipulations;

public class StringIsEmpty {
    public static void main(String[] args) {
        String JobTitle= "";
        System.out.println(JobTitle.isEmpty());
        System.out.println(JobTitle.length());
        System.out.println(JobTitle.length() == 0);
        if(JobTitle. isEmpty()){
            System.out.println("Job Title is missing, please resend");
        }else{
            System.out.println("Job Title looks good");
        }if(JobTitle.length()==0){
            System.out.println("job title is empty");
        }else{
            System.out.println("it is not empty");
        }
        System.out.println(JobTitle.equals(""));

        if ("".equals(JobTitle)){System.out.println("job title is empty");}

        else{System.out.println("it is not empty");}
        String word =" ";
        System.out.println(word.isEmpty());//false
        System.out.println(word.length());//1 blank space is a character

        String veggie ="carrots";
        System.out.println(veggie.isEmpty());//false
        //if veggie is not empty print we have carrots
        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
        String word2;
       // System.out.println(word2.isEmpty());error not initialized
    }
}
