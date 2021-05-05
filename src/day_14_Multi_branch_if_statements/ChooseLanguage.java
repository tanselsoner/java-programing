package day_14_Multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose Your Language");
        int selection =3;
        if (selection==1){
            System.out.println("Thank you for Your call");
        }else if (selection==2){
            System.out.println("Hola ,Gracias para llamar");
        }else if (selection==3){
            System.out.println("Merhaba Aradiginiz Icin tessekurler");
        }else if (selection==4){
            System.out.println("priviet,spasibo za vash zvonok");
        }else if(selection==5){
            System.out.println("Merci,pourvotre appel");
        }else{
            System.out.println("lets talk java");
        }
    }
}
