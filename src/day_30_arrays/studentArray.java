package day_30_arrays;

public class studentArray
{
    public static void main(String[] args) {
        String[]student1= new String[5];
        student1[0]="TY1860";
        student1[1]="Tansel";
        student1[2]="Yalbuzdag";
        student1[3]="B22";
        student1[4]="917-459-6698";
        String[] student2={"1340","Soner","Yalbuzdag","B22","917-459-6598"};
        System.out.println("student1 id= "+student1[0]);
        System.out.println("student1 firstname = "+student1[1]);
        System.out.println("student1 lastname = "+student1[2]);
        System.out.println("student1 batch num = "+student1[3]);
        System.out.println("student1 phone num = "+student1[4]);
        System.out.println("student data lenght " +student1.length);

        if (student1.length==5){
            System.out.println("Pass: data array has correct lenght");
        } else {
            System.out.println( "Fail: data array has incorrect lenght");}
        if(student1.length==student2.length){
            System.out.println("Pass:data arrays lenght match");}
        else{
            System.out.println("fail:data arrays lenght mismatch");}
        }




    }

