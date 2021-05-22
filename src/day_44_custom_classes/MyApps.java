package day_44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
       // String app1 = "uber";//String object.just characters
        //App app2;
        //System.out.println("app = " +app1);
        App uberApp=new App();
        // uber ,3.5
        uberApp.name="uber";
        uberApp.version=3.5;
        uberApp.open();//call open method using object variable
        uberApp.version =4.0;
        uberApp.open();//open new version
    }
}
