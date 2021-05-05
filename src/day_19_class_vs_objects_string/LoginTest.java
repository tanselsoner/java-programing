package day_19_class_vs_objects_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName="cybertek";
        String expPassword = "Abc123";
        String userName = "Cybertek";
        String password ="abc123";
        if(expUserName.equalsIgnoreCase (userName) && expPassword.equals(password)){
            System.out.println(" Pass - user logged in");

        }else{
            if (!expUserName.equalsIgnoreCase(userName)){
            System.out.println("Fail - username is incorrect");
        }else{System.out.println("Fail - wrong password");}
        }
    }
}
